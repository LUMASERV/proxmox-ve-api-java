package com.lumaserv.proxmox.ve.model.firewall;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
@Setter
public class FirewallIPSetEntry {

    String cidr;
    String digest;
    String comment;
    @MapperOptions(name = "nomatch")
    Boolean noMatch;

}
