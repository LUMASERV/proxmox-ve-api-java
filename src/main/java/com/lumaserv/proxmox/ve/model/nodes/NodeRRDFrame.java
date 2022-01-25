package com.lumaserv.proxmox.ve.model.nodes;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class NodeRRDFrame {

    @MapperOptions(name = "ioWait")
    Double ioWait;
    Long time;
    @MapperOptions(name = "loadavg")
    Double loadAverage;
    @MapperOptions(name = "roottotal")
    Long rootTotal;
    Double cpu;
    @MapperOptions(name = "swaptotal")
    Long swapTotal;
    @MapperOptions(name = "memused")
    Double memoryUsed;
    @MapperOptions(name = "netout")
    Double netOut;
    @MapperOptions(name = "netin")
    Double netIn;
    @MapperOptions(name = "rootused")
    Double rootUsed;
    @MapperOptions(name = "maxcpu")
    Double maxCpu;
    @MapperOptions(name = "swapused")
    Long swapUsed;
    @MapperOptions(name = "memtotal")
    Long memoryTotal;

}
