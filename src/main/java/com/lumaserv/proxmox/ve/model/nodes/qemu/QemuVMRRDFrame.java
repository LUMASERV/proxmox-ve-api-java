package com.lumaserv.proxmox.ve.model.nodes.qemu;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class QemuVMRRDFrame {

    Long disk;
    @MapperOptions(name = "mem")
    Double memory;
    @MapperOptions(name = "maxdisk")
    Long maxDisk;
    Double cpu;
    @MapperOptions(name = "diskread")
    Long diskRead;
    @MapperOptions(name = "maxcpu")
    Double maxCpu;
    @MapperOptions(name = "netout")
    Double netOut;
    Long time;
    @MapperOptions(name = "diskwrite")
    Long diskWrite;
    @MapperOptions(name = "maxmem")
    Double maxMemory;
    @MapperOptions(name = "netin")
    Double netIn;

}
