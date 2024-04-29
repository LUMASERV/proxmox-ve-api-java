package com.lumaserv.proxmox.ve.model.nodes.lxc;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
@Setter
public class LXC {

    @MapperOptions(name = "vmid")
    int id;
    String status;
    Double cpus;
    String lock;
    @MapperOptions(name = "maxdisk")
    Long maxDisk;
    @MapperOptions(name = "maxmem")
    Long maxMemory;
    @MapperOptions(name = "mem")
    Long memory;
    @MapperOptions(name = "maxswap")
    Long maxSwap;
    String name;
    Integer pid;
    String tags;
    Integer uptime;
}
