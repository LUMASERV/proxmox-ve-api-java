package com.lumaserv.proxmox.ve.model.sdn;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
@Setter
public class SDNSubnet {

    String vnet;
    @MapperOptions(name = "subnet")
    String name;
    String zone;
    String digest;
    String cidr;
    String type;
    String gateway;
    String network;
    String mask;

}
