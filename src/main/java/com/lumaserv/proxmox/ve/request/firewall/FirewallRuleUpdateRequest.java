package com.lumaserv.proxmox.ve.request.firewall;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class FirewallRuleUpdateRequest extends ProxMoxVERequest<FirewallRuleUpdateRequest> {

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
    String delete;
    @MapperOptions(name = "moveto")
    Integer moveTo;

    public FirewallRuleUpdateRequest setEnable(Boolean enable) {
        this.enable = enable == null ? null : (enable ? 1 : 0);
        return this;
    }

}
