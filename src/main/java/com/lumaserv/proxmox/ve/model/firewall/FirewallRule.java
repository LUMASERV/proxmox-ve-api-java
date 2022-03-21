package com.lumaserv.proxmox.ve.model.firewall;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class FirewallRule {

    String log;
    Integer pos;
    Integer enable;
    String digest;
    String action;
    String comment;
    String source;
    String type;
    @MapperOptions(name = "dport")
    String destinationPort;
    @MapperOptions(name = "sport")
    String sourcePort;
    @MapperOptions(name = "ipversion")
    Integer ipVersion;
    @MapperOptions(name = "dest")
    String destination;
    @MapperOptions(name = "proto")
    String protocol;
    String macro;
    String iface;
    @MapperOptions(name = "icmp-type")
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
