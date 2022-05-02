package com.lumaserv.proxmox.ve.model.sdn;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
@Setter
public class SDNZone {

    @MapperOptions(name = "zone")
    String name;
    String nodes;
    String ipam;
    String digest;
    String peers;
    String type;
    Integer mtu;
    String dns;
    @MapperOptions(name = "dnszone")
    String dnsZone;
    String pending;
    String state;
    @MapperOptions(name = "reversedns")
    String reverseDns;

}
