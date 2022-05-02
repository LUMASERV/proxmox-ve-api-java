package com.lumaserv.proxmox.ve.model.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QemuVMResource extends Resource {

    Double cpu;
    Long disk;
    String hastate;
    Double maxcpu;
    Long maxdisk;
    Long maxmem;
    Long mem;
    String name;
    String node;
    String pool;
    String status;
    Integer uptime;
    Integer netin;
    Integer netout;
    Integer template;
    Integer vmid;
    Integer diskwrite;
    Integer diskread;

}
