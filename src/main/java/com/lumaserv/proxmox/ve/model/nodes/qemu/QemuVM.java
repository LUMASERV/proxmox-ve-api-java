package com.lumaserv.proxmox.ve.model.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class QemuVM {

    @SerializedName("vmid")
    int id;
    String status;
    Double cpus;
    String lock;
    @SerializedName("maxdisk")
    Long maxDisk;
    @SerializedName("mem")
    Long memory;
    @SerializedName("maxmem")
    Long maxMemory;
    String name;
    Integer pid;
    @SerializedName("qmpstatus")
    String qmpStatus;
    Integer uptime;

}
