package com.lumaserv.proxmox.ve.request.firewall;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.model.firewall.FirewallRule;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class FirewallRuleUpdateRequest extends ProxMoxVERequest<FirewallRuleUpdateRequest> {

    String log;
    Integer pos;
    Integer enable;
    String digest;
    FirewallRule.Action action;
    String comment;
    String source;
    String type;
    @SerializedName("dport")
    String destinationPort;
    @SerializedName("sport")
    String sourcePort;
    @SerializedName("ipversion")
    Integer ipVersion;
    @SerializedName("dest")
    String destination;
    @SerializedName("proto")
    String protocol;
    String macro;
    String iface;
    @SerializedName("icmp-type")
    String icmpType;
    String delete;
    @SerializedName("moveto")
    Integer moveTo;

    public FirewallRuleUpdateRequest setEnable(Boolean enable) {
        this.enable = enable == null ? null : (enable ? 1 : 0);
        return this;
    }

}
