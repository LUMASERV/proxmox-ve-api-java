package com.lumaserv.proxmox.ve.model.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class QemuVMRRDFrame {

    Long disk;
    @SerializedName("mem")
    Double memory;
    @SerializedName("maxdisk")
    Long maxDisk;
    Double cpu;
    @SerializedName("diskread")
    Long diskRead;
    @SerializedName("maxcpu")
    Double maxCpu;
    @SerializedName("netout")
    Double netOut;
    Long time;
    @SerializedName("diskwrite")
    Long diskWrite;
    @SerializedName("maxmem")
    Double maxMemory;
    @SerializedName("netin")
    Double netIn;

}
