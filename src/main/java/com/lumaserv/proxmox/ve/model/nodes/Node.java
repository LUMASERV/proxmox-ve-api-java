package com.lumaserv.proxmox.ve.model.nodes;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class Node {

    @MapperOptions(name = "node")
    String name;
    String status;
    Double cpu;
    String level;
    @MapperOptions(name = "maxcpu")
    Integer maxCpu;
    @MapperOptions(name = "maxmem")
    Long maxMemory;
    @MapperOptions(name = "mem")
    Long memory;
    String sslFingerprint;
    Integer uptime;

}
