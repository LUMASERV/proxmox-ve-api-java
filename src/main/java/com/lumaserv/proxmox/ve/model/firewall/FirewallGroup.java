package com.lumaserv.proxmox.ve.model.firewall;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
@Setter
public class FirewallGroup {

    @MapperOptions(name = "group")
    String name;
    String digest;
    String comment;

}
