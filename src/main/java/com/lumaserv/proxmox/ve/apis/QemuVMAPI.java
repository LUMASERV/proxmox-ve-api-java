package com.lumaserv.proxmox.ve.apis;

import com.lumaserv.proxmox.ve.ProxMoxVEException;
import com.lumaserv.proxmox.ve.model.firewall.FirewallIPSet;
import com.lumaserv.proxmox.ve.model.firewall.FirewallIPSetEntry;
import com.lumaserv.proxmox.ve.model.firewall.FirewallOptions;
import com.lumaserv.proxmox.ve.model.firewall.FirewallRule;
import com.lumaserv.proxmox.ve.model.nodes.qemu.QemuVMConfig;
import com.lumaserv.proxmox.ve.model.nodes.qemu.QemuVMRRDFrame;
import com.lumaserv.proxmox.ve.model.nodes.qemu.QemuVMStatus;
import com.lumaserv.proxmox.ve.request.*;
import com.lumaserv.proxmox.ve.request.firewall.*;
import com.lumaserv.proxmox.ve.request.nodes.qemu.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractElement;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public class QemuVMAPI {

    final NodeAPI nodeAPI;
    final int vmId;

    public <T> T request(String method, String path, ProxMoxVERequest<?> request, Class<T> responseType) throws ProxMoxVEException {
        return nodeAPI.request(method, "/qemu/" + vmId + path, request, responseType);
    }

    public AbstractElement request(String method, String path, AbstractObject request) throws ProxMoxVEException {
        return nodeAPI.request(method, "/qemu/" + vmId + path, request);
    }

    public String reboot() throws ProxMoxVEException {
        return reboot((Integer) null);
    }

    public String reboot(Integer timeout) throws ProxMoxVEException {
        return reboot(new QemuVMRebootRequest().setTimeout(timeout));
    }

    public String reboot(QemuVMRebootRequest request) throws ProxMoxVEException {
        return request("POST", "/status/reboot", request, String.class);
    }

    public String reset() throws ProxMoxVEException {
        return reset(new QemuVMResetRequest());
    }

    public String reset(QemuVMResetRequest request) throws ProxMoxVEException {
        return request("POST", "/status/reset", request, String.class);
    }

    public String resume() throws ProxMoxVEException {
        return resume(new QemuVMResumeRequest());
    }

    public String resume(QemuVMResumeRequest request) throws ProxMoxVEException {
        return request("POST", "/status/resume", request, String.class);
    }

    public String shutdown() throws ProxMoxVEException {
        return shutdown((Integer) null);
    }

    public String shutdown(Integer timeout) throws ProxMoxVEException {
        return shutdown(new QemuVMShutdownRequest().setTimeout(timeout));
    }

    public String shutdown(QemuVMShutdownRequest request) throws ProxMoxVEException {
        return request("POST", "/status/shutdown", request, String.class);
    }

    public String start() throws ProxMoxVEException {
        return start(new QemuVMStartRequest());
    }

    public String start(QemuVMStartRequest request) throws ProxMoxVEException {
        return request("POST", "/status/start", request, String.class);
    }

    public String stop() throws ProxMoxVEException {
        return stop(new QemuVMStopRequest());
    }

    public String stop(QemuVMStopRequest request) throws ProxMoxVEException {
        return request("POST", "/status/stop", request, String.class);
    }

    public String suspend() throws ProxMoxVEException {
        return suspend(new QemuVMSuspendRequest());
    }

    public String suspend(QemuVMSuspendRequest request) throws ProxMoxVEException {
        return request("POST", "/status/suspend", request, String.class);
    }

    public String clone(QemuVMCloneRequest request) throws ProxMoxVEException {
        return request("POST", "/clone", request, String.class);
    }

    public String delete(QemuVMDeleteRequest request) throws ProxMoxVEException {
        return request("DELETE", "", request, String.class);
    }

    public QemuVMConfig getConfig() throws ProxMoxVEException {
        return getConfig(new QemuVMConfigGetRequest());
    }

    public QemuVMConfig getCurrentConfig() throws ProxMoxVEException {
        return getConfig(new QemuVMConfigGetRequest().setCurrent(true));
    }

    public QemuVMConfig getSnapshotConfig(String snapshot) throws ProxMoxVEException {
        return getConfig(new QemuVMConfigGetRequest().setSnapshot(snapshot));
    }

    public QemuVMConfig getConfig(QemuVMConfigGetRequest request) throws ProxMoxVEException {
        return QemuVMConfig.from(request("GET", "/config", request, AbstractObject.class));
    }

    public String updateConfig(QemuVMConfigUpdateRequest request) throws ProxMoxVEException {
        return request("POST", "/config", request, String.class);
    }

    public void updateConfigSync(QemuVMConfigUpdateRequest request) throws ProxMoxVEException {
        request("PUT", "/config", request, null);
    }

    public String migrate(QemuVMMigrateRequest request) throws ProxMoxVEException {
        return request("POST", "/migrate", request, String.class);
    }

    public void resize(QemuVMResizeRequest request) throws ProxMoxVEException {
        request("PUT", "/resize", request, null);
    }

    public void unlink(QemuVMUnlinkRequest request) throws ProxMoxVEException {
        request("PUT", "/unlink", request, null);
    }

    public List<QemuVMRRDFrame> getRRDData(QemuVMRRDDataGetRequest request) throws ProxMoxVEException {
        return Arrays.asList(request("GET", "/rrddata", request, QemuVMRRDFrame[].class));
    }

    public QemuVMStatus getStatus() throws ProxMoxVEException {
        return QemuVMStatus.from(request("GET", "/status/current", null, AbstractObject.class));
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

}
