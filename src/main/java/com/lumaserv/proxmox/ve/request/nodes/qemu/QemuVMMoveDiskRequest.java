package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMMoveDiskRequest extends ProxMoxVERequest<QemuVMMoveDiskRequest> {

    String disk;
    @SerializedName("bwlimit")
    Integer bandwidthLimit;
    String format;
    String storage;
    @SerializedName("target-digest")
    String targetDigest;
    @SerializedName("target-disk")
    String targetDisk;
    @SerializedName("target-vmid")
    Integer targetVMId;

}
