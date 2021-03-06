package com.lumaserv.proxmox.ve.model.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NodeResource extends Resource {

    String node;
    Long disk;
    Double maxcpu;
    Long maxdisk;
    Double cpu;
    Long mem;
    Long maxmem;
    Integer uptime;
    String status;
    String level;

}
