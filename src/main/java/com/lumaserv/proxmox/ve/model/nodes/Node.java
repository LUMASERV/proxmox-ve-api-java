package com.lumaserv.proxmox.ve.model.nodes;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Node {

    @SerializedName("node")
    String name;
    String status;
    Double cpu;
    String level;
    @SerializedName("maxcpu")
    Integer maxCpu;
    @SerializedName("maxmem")
    Long maxMemory;
    @SerializedName("mem")
    Long memory;
    String sslFingerprint;
    Integer uptime;

}
