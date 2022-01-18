package com.lumaserv.proxmox.ve.model.firewall;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class FirewallGroup {

    @MapperOptions(name = "group")
    String name;
    String digest;
    String comment;

}
