package com.lumaserv.proxmox.ve.model.firewall;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class FirewallRule {

    String log;
    Integer pos;
    Integer enable;
    String digest;
    Action action;
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

    public Boolean getEnable() {
        return enable == null ? null : (enable > 0);
    }

    public boolean isEnabled() {
        return enable != null && (enable > 0);
    }

    public enum Action {
        ACCEPT,
        DROP,
        REJECT
    }

}
