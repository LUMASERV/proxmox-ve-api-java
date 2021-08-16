package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMCloneRequest extends ProxMoxVERequest<QemuVMCloneRequest> {

    @SerializedName("newid")
    Integer newId;
    @SerializedName("bwlimit")
    Integer bandwidthLimit;
    String description;
    String format;
    Integer full;
    String name;
    String pool;
    @SerializedName("snapname")
    String snapshotName;
    String storage;
    String target;

    public QemuVMCloneRequest setFull(Boolean full) {
        this.full = full == null ? null : (full ? 1 : 0);
        return this;
    }

}
