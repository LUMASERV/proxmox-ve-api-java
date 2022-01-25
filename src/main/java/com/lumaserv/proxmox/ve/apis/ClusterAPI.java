package com.lumaserv.proxmox.ve.apis;

import com.lumaserv.proxmox.ve.ProxMoxVEClient;
import com.lumaserv.proxmox.ve.ProxMoxVEException;
import com.lumaserv.proxmox.ve.model.Task;
import com.lumaserv.proxmox.ve.model.firewall.*;
import com.lumaserv.proxmox.ve.model.resource.Resource;
import com.lumaserv.proxmox.ve.model.sdn.SDNSubnet;
import com.lumaserv.proxmox.ve.model.sdn.SDNVNet;
import com.lumaserv.proxmox.ve.model.sdn.SDNZone;
import com.lumaserv.proxmox.ve.request.GenericProxMoxVERequest;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import com.lumaserv.proxmox.ve.request.cluster.ResourcesGetRequest;
import com.lumaserv.proxmox.ve.request.firewall.*;
import com.lumaserv.proxmox.ve.request.sdn.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractElement;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public class ClusterAPI {

    final ProxMoxVEClient client;

    public <T> T request(String method, String path, ProxMoxVERequest<?> request, Class<T> responseType) throws ProxMoxVEException {
        return client.request(method, "/cluster" + path, request, responseType);
    }

    public AbstractElement request(String method, String path, AbstractObject request) throws ProxMoxVEException {
        return client.request(method, "/cluster" + path, request);
    }

    public List<FirewallGroup> getFirewallGroups() throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/firewall/groups", null, FirewallGroup[].class));
    }

    public void createFirewallGroup(FirewallGroupCreateRequest request) throws ProxMoxVEException {
        request("POST", "/firewall/groups", request, null);
    }

    public void deleteFirewallGroup(String name) throws ProxMoxVEException {
        request("DELETE", "/firewall/groups/" + name, null, null);
    }

    public List<FirewallRule> getFirewallGroupRules(String name) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/firewall/groups/" + name, null, FirewallRule[].class));
    }

    public void createFirewallGroupRule(String group, FirewallRuleCreateRequest request) throws ProxMoxVEException {
        request("POST", "/firewall/groups/" + group, request, null);
    }

    public void updateFirewallGroupRule(String group, int pos, FirewallRuleUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/firewall/groups/" + group + "/" + pos, request, null);
    }

    public FirewallRule getFirewallGroupRule(String group, int pos) throws ProxMoxVEException {
        return request("GET", "/firewall/groups/" + group + "/" + pos, null, FirewallRule.class);
    }

    public void deleteFirewallGroupRule(String group, int pos) throws ProxMoxVEException {
        request("DELETE", "/firewall/groups/" + group + "/" + pos, null, null);
    }

    public List<FirewallRule> getFirewallRules() throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/firewall/rules", null, FirewallRule[].class));
    }

    public void createFirewallRule(FirewallRuleCreateRequest request) throws ProxMoxVEException {
        request("POST", "/firewall/rules", request, null);
    }

    public FirewallRule getFirewallRule(int pos) throws ProxMoxVEException {
        return request("GET", "/firewall/rules/" + pos, null, FirewallRule.class);
    }

    public void updateFirewallRule(int pos, FirewallRuleUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/firewall/rules/" + pos, request, null);
    }

    public void deleteFirewallRule(int pos) throws ProxMoxVEException {
        request("DELETE", "/firewall/rules/" + pos, null, null);
    }

    public FirewallOptions getFirewallOptions() throws ProxMoxVEException {
        return request("GET", "/firewall/options", null, FirewallOptions.class);
    }

    public void updateFirewallOptions(FirewallOptionsUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/firewall/options", request, null);
    }

    public List<FirewallIPSet> getFirewallIPSets() throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/firewall/ipset", null, FirewallIPSet[].class));
    }

    public void createFirewallIPSet(FirewallIPSetCreateRequest request) throws ProxMoxVEException {
        request("POST", "/firewall/ipset", request, null);
    }

    public void deleteFirewallIPSet(String ipset) throws ProxMoxVEException {
        request("DELETE", "/firewall/ipset/" + ipset, null, null);
    }

    public List<FirewallIPSetEntry> getFirewallIPSetEntries(String ipset) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/firewall/ipset/" + ipset, null, FirewallIPSetEntry[].class));
    }

    public void createFirewallIPSetEntry(String ipset, FirewallIPSetEntryCreateRequest request) throws ProxMoxVEException {
        request("POST", "/firewall/ipset/" + ipset, request, null);
    }

    public FirewallIPSetEntry getFirewallIPSetEntry(String ipset, String cidr) throws ProxMoxVEException {
        return request("GET", "/firewall/ipset/" + ipset + "/" + cidr, null, FirewallIPSetEntry.class);
    }

    public void updateFirewallIPSetEntry(String ipset, String cidr, FirewallIPSetEntryUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/firewall/ipset/" + ipset + "/" + cidr, request, null);
    }

    public void deleteFirewallIPSetEntry(String ipset, String cidr) throws ProxMoxVEException {
        request("DELETE", "/firewall/ipset/" + ipset + "/" + cidr, null, null);
    }

    public String applySDN() throws ProxMoxVEException {
        return request("PUT", "/sdn", null, String.class);
    }

    public List<SDNZone> getSDNZones() throws ProxMoxVEException {
        return getSDNZones(new SDNZoneGetRequest());
    }

    public List<SDNZone> getSDNZones(SDNZoneGetRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/sdn/zones", request, SDNZone[].class));
    }

    public void createSDNZone(SDNZoneCreateRequest request) throws ProxMoxVEException {
        request("POST", "/sdn/zones", request, null);
    }

    public SDNZone getSDNZone(String name) throws ProxMoxVEException {
        return getSDNZone(name, new SDNZoneGetRequest());
    }

    public SDNZone getSDNZone(String name, SDNZoneGetRequest request) throws ProxMoxVEException {
        return request("GET", "/sdn/zones/" + name, request, null);
    }

    public void updateSDNZone(String name, SDNZoneUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/sdn/zones/" + name, request, null);
    }

    public void deleteSDNZone(String name) throws ProxMoxVEException {
        request("DELETE", "/sdn/zones/" + name, null, null);
    }

    public List<SDNVNet> getSDNVNets() throws ProxMoxVEException {
        return getSDNVNets(new SDNVNetGetRequest());
    }

    public List<SDNVNet> getSDNVNets(SDNVNetGetRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/sdn/vnets", request, SDNVNet[].class));
    }

    public void createSDNVNet(SDNVNetCreateRequest request) throws ProxMoxVEException {
        request("POST", "/sdn/vnets", request, null);
    }

    public void updateSDNVNet(String name, SDNVNetUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/sdn/vnets/" + name, request, null);
    }

    public void deleteSDNVNet(String name) throws ProxMoxVEException {
        request("DELETE", "/sdn/vnets/" + name, null, null);
    }

    public List<SDNSubnet> getSDNVNetSubnets(String vnet) throws ProxMoxVEException {
        return getSDNVNetSubnets(vnet, new SDNSubnetGetRequest());
    }

    public List<SDNSubnet> getSDNVNetSubnets(String vnet, SDNSubnetGetRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/sdn/vnets/" + vnet + "/subnets", request, SDNSubnet[].class));
    }

    public void createSDNVNetSubnet(String vnet, SDNSubnetCreateRequest request) throws ProxMoxVEException {
        request("POST", "/sdn/vnets/" + vnet + "/subnets", request, null);
    }

    public SDNSubnet getSDNVNetSubnet(String vnet, String name) throws ProxMoxVEException {
        return getSDNVNetSubnet(vnet, name, new SDNSubnetGetRequest());
    }

    public SDNSubnet getSDNVNetSubnet(String vnet, String name, SDNSubnetGetRequest request) throws ProxMoxVEException {
        return request("GET", "/sdn/vnets/" + vnet + "/subnets/" + name, request, SDNSubnet.class);
    }

    public void updateSDNVNetSubnet(String vnet, String name, SDNSubnetUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/sdn/vnets/" + vnet + "/subnets/" + name, request, null);
    }

    public void deleteSDNVNetSubnet(String vnet, String name) throws ProxMoxVEException {
        request("DELETE", "/sdn/vnets/" + vnet + "/subnets/" + name, null, null);
    }

    public List<Task> getTasks() throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/tasks", null, Task[].class));
    }

    public int nextId() throws ProxMoxVEException {
        return Integer.parseInt(request("GET", "/nextid", null, String.class));
    }

    public List<Resource> getResources() throws ProxMoxVEException {
        return getResources(null);
    }

    public List<Resource> getResources(String type) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/resources", new GenericProxMoxVERequest().set("type", type), Resource[].class));
    }

}
