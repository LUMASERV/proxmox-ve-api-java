package com.lumaserv.proxmox.ve;

import com.lumaserv.proxmox.ve.apis.AccessAPI;
import com.lumaserv.proxmox.ve.apis.ClusterAPI;
import com.lumaserv.proxmox.ve.apis.NodeAPI;
import com.lumaserv.proxmox.ve.mapper.ResourceMapper;
import com.lumaserv.proxmox.ve.model.nodes.Node;
import com.lumaserv.proxmox.ve.model.pools.Pool;
import com.lumaserv.proxmox.ve.model.storage.Storage;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import com.lumaserv.proxmox.ve.request.access.AccessTicketCreateRequest;
import com.lumaserv.proxmox.ve.request.pools.PoolCreateRequest;
import com.lumaserv.proxmox.ve.request.pools.PoolUpdateRequest;
import com.lumaserv.proxmox.ve.request.storage.StorageCreateRequest;
import com.lumaserv.proxmox.ve.request.storage.StorageGetRequest;
import com.lumaserv.proxmox.ve.request.storage.StorageUpdateRequest;
import com.lumaserv.proxmox.ve.response.access.AccessTicketCreateResponse;
import org.javawebstack.abstractdata.AbstractElement;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.Mapper;
import org.javawebstack.abstractdata.mapper.naming.NamingPolicy;
import org.javawebstack.httpclient.HTTPClient;
import org.javawebstack.httpclient.HTTPRequest;

import java.net.HttpCookie;
import java.util.Arrays;
import java.util.List;

public class ProxMoxVEClient {

    public static final Mapper MAPPER = new Mapper()
            .namingPolicy(NamingPolicy.SNAKE_CASE)
            .adapter(new ResourceMapper());

    final HTTPClient client;
    final ClusterAPI clusterAPI = new ClusterAPI(this);;
    final AccessAPI accessAPI = new AccessAPI(this);

    public ProxMoxVEClient(String host) throws ProxMoxVEException {
        this(host, null, null, null);
    }

    public ProxMoxVEClient(String host, String username, String password) throws ProxMoxVEException {
        this(host, null, username, password);
    }

    public ProxMoxVEClient(String host, String realm, String username, String password) throws ProxMoxVEException {
        client = new HTTPClient().setBaseUrl("https://" + host + ":8006/api2/json");
        client.setSSLVerification(false);
        if(username != null && password != null) {
            setAuth(accessAPI.createTicket(new AccessTicketCreateRequest()
                    .setUsername(username)
                    .setPassword(password)
                    .setRealm(realm)
            ));
        }
    }

    public ProxMoxVEClient(String host, String token) {
        client = new HTTPClient().setBaseUrl("https://" + host + ":8006/api2/json");
        client.setSSLVerification(false);
        client.header("Authorization", "PVEAPIToken=" + token);
    }

    public ProxMoxVEClient setAuth(AccessTicketCreateResponse response) {
        return setAuth(response.getTicket(), response.getCsrfPreventionToken());
    }

    public ProxMoxVEClient setAuth(String ticket, String csrfPreventionToken) {
        client.header("CSRFPreventionToken", csrfPreventionToken);
        client.cookie(new HttpCookie("PVEAuthCookie", ticket));
        return this;
    }

    public ProxMoxVEClient debug() {
        client.debug();
        return this;
    }

    public <T> T request(String method, String path, ProxMoxVERequest<?> request, Class<T> responseType) throws ProxMoxVEException {
        AbstractElement res = request(method, path, MAPPER.map(request).object());
        if(responseType == null)
            return null;
        return MAPPER.map(res, responseType);
    }

    public AbstractElement request(String method, String path, AbstractObject request) throws ProxMoxVEException {
        HTTPRequest http = client.request(method, path);
        if(request != null) {
            if(!method.equalsIgnoreCase("GET"))
                http.jsonBodyElement(request);
            else
                request.keys().forEach(k -> http.query(k, request.get(k).toString()));
        }
        if(http.status() < 200 || http.status() > 299)
            throw new ProxMoxVEException(http);
        try {
            http.data();
        } catch (Exception ex) {

        }
        return http.data().object().get("data");
    }

    public List<Node> getNodes() throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/nodes", null, Node[].class));
    }

    public void createPool(String id) throws ProxMoxVEException {
        createPool(id, null);
    }

    public void createPool(String id, String comment) throws ProxMoxVEException {
        createPool(new PoolCreateRequest().setId(id).setComment(comment));
    }

    public void createPool(PoolCreateRequest request) throws ProxMoxVEException {
        request("POST", "/pools", request, null);
    }

    public List<Pool> getPools() throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/pools", null, Pool[].class));
    }

    public Pool getPool(String id) throws ProxMoxVEException {
        return request("GET", "/pools/" + id, null, Pool.class);
    }

    public void updatePool(String id, PoolUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/pools/" + id, request, null);
    }

    public void deletePool(String id) throws ProxMoxVEException {
        request("DELETE", "/pools/" + id, null, null);
    }

    public List<Storage> getStorages() throws ProxMoxVEException {
        return getStorages(new StorageGetRequest());
    }

    public List<Storage> getStorages(StorageGetRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/storage", request, Storage[].class));
    }

    public void createStorage(StorageCreateRequest request) throws ProxMoxVEException {
        request("POST", "/storage", request, null);
    }

    public Storage getStorage(String name) throws ProxMoxVEException {
        return request("GET", "/storage/" + name, null, Storage.class);
    }

    public void updateStorage(String name, StorageUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/storage/" + name, request, null);
    }

    public void deleteStorage(String name) throws ProxMoxVEException {
        request("DELETE", "/storage/" + name, null, null);
    }

    public ClusterAPI cluster() {
        return clusterAPI;
    }

    public NodeAPI nodes(String node) {
        return new NodeAPI(this, node);
    }

    public AccessAPI access() {
        return accessAPI;
    }

}
