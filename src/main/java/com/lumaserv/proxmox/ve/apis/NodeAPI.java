package com.lumaserv.proxmox.ve.apis;

import com.lumaserv.proxmox.ve.ProxMoxVEClient;
import com.lumaserv.proxmox.ve.ProxMoxVEException;
import com.lumaserv.proxmox.ve.model.Task;
import com.lumaserv.proxmox.ve.model.TaskLogLine;
import com.lumaserv.proxmox.ve.model.firewall.FirewallOptions;
import com.lumaserv.proxmox.ve.model.firewall.FirewallRule;
import com.lumaserv.proxmox.ve.model.nodes.NodeRRDFrame;
import com.lumaserv.proxmox.ve.model.nodes.lxc.LXC;
import com.lumaserv.proxmox.ve.model.nodes.qemu.QemuVM;
import com.lumaserv.proxmox.ve.model.storage.Storage;
import com.lumaserv.proxmox.ve.model.storage.StorageVolume;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import com.lumaserv.proxmox.ve.request.firewall.FirewallOptionsUpdateRequest;
import com.lumaserv.proxmox.ve.request.firewall.FirewallRuleCreateRequest;
import com.lumaserv.proxmox.ve.request.firewall.FirewallRuleUpdateRequest;
import com.lumaserv.proxmox.ve.request.nodes.RRDDataGetRequest;
import com.lumaserv.proxmox.ve.request.nodes.TaskGetRequest;
import com.lumaserv.proxmox.ve.request.nodes.TaskLogRequest;
import com.lumaserv.proxmox.ve.request.nodes.VZDumpRequest;
import com.lumaserv.proxmox.ve.request.nodes.qemu.QemuVMCreateRequest;
import com.lumaserv.proxmox.ve.request.nodes.storage.NodeStorageGetRequest;
import com.lumaserv.proxmox.ve.request.nodes.storage.StorageVolumeCreateRequest;
import com.lumaserv.proxmox.ve.request.nodes.storage.StorageVolumeGetRequest;
import com.lumaserv.proxmox.ve.request.nodes.storage.StorageVolumeUpdateRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractArray;
import org.javawebstack.abstractdata.AbstractElement;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class NodeAPI {

    final ProxMoxVEClient client;
    final String nodeName;

    public <T> T request(String method, String path, ProxMoxVERequest<?> request, Class<T> responseType) throws ProxMoxVEException {
        return client.request(method, "/nodes/" + nodeName + path, request, responseType);
    }

    public AbstractElement request(String method, String path, AbstractObject request) throws ProxMoxVEException {
        return client.request(method, "/nodes/" + nodeName + path, request);
    }

    public List<QemuVM> getQemuVMs() throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/qemu", null, QemuVM[].class));
    }

    public String createQemuVM(QemuVMCreateRequest request) throws ProxMoxVEException {
        return request("POST", "/qemu", request, String.class);
    }
    public List<LXC> getLXCs() throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/lxc", null, LXC[].class));
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

    public String vzdump(VZDumpRequest request) throws ProxMoxVEException {
        return request("POST", "/vzdump", request, String.class);
    }

    public List<Storage> getStorages() throws ProxMoxVEException {
        return getStorages(new NodeStorageGetRequest());
    }

    public List<Storage> getStorages(NodeStorageGetRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/storage", request, Storage[].class));
    }

    public List<StorageVolume> getStorageVolumes(String storage) throws ProxMoxVEException {
        return getStorageVolumes(storage, new StorageVolumeGetRequest());
    }

    public List<StorageVolume> getStorageVolumes(String storage, StorageVolumeGetRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/storage/" + storage + "/content", request, StorageVolume[].class));
    }

    public String createStorageVolume(String storage, StorageVolumeCreateRequest request) throws ProxMoxVEException {
        return request("POST", "/storage/" + storage + "/content", request, String.class);
    }

    public StorageVolume getStorageVolume(String storage, String id) throws ProxMoxVEException {
        return request("GET", "/storage/" + storage + "/content/" + id, null, StorageVolume.class);
    }

    public void updateStorageVolume(String storage, String id, StorageVolumeUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/storage/" + storage + "/content/" + id, request, null);
    }

    public void deleteStorageVolume(String storage, String id) throws ProxMoxVEException {
        request("DELETE", "/storage/" + storage + "/content/" + id, null, null);
    }

    public Map<String, String> getSDNZones() throws ProxMoxVEException {
        return request("GET", "/sdn/zones", null, AbstractArray.class).stream().map(AbstractElement::object).collect(Collectors.toMap(z -> z.string("zone"), z -> z.string("status")));
    }

    public List<Task> getTasks() throws ProxMoxVEException {
        return getTasks(new TaskGetRequest());
    }

    public List<Task> getTasks(TaskGetRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/tasks", request, Task[].class));
    }

    public void stopTask(String upid) throws ProxMoxVEException {
        request("DELETE", "/tasks/" + upid, null, null);
    }

    public Task getTask(String upid) throws ProxMoxVEException {
        return request("GET", "/tasks/" + upid + "/status", null, Task.class);
    }

    public List<TaskLogLine> getTaskLog(String upid) throws ProxMoxVEException {
        return getTaskLog(upid, new TaskLogRequest());
    }

    public List<TaskLogLine> getTaskLog(String upid, TaskLogRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/tasks/" + upid + "/log", request, TaskLogLine[].class));
    }

    public QemuVMAPI qemu(int vmId) {
        return new QemuVMAPI(this, vmId);
    }

    public List<NodeRRDFrame> getRRDData(RRDDataGetRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/rrddata", request, NodeRRDFrame[].class));
    }

}
