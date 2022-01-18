package com.lumaserv.proxmox.ve.model.nodes.qemu;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class QemuVM {

    @MapperOptions(name = "vmid")
    int id;
    String status;
    Double cpus;
    String lock;
    @MapperOptions(name = "maxdisk")
    Long maxDisk;
    @MapperOptions(name = "mem")
    Long memory;
    @MapperOptions(name = "maxmem")
    Long maxMemory;
    String name;
    Integer pid;
    @MapperOptions(name = "qmpstatus")
    String qmpStatus;
    Integer uptime;

}
