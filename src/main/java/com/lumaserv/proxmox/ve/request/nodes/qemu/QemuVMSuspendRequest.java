package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMSuspendRequest extends ProxMoxVERequest<QemuVMSuspendRequest> {

    @SerializedName("skiplock")
    Integer skipLock;
    @SerializedName("statestorage")
    String stateStorage;
    @SerializedName("todisk")
    Integer toDisk;

    public QemuVMSuspendRequest setSkipLock(Boolean skipLock) {
        this.skipLock = skipLock == null ? null : (skipLock ? 1 : 0);
        return this;
    }

    public QemuVMSuspendRequest setToDisk(Boolean toDisk) {
        this.toDisk = toDisk == null ? null : (toDisk ? 1 : 0);
        return this;
    }

}
