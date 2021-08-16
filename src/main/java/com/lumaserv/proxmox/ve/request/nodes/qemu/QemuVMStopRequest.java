package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMStopRequest extends ProxMoxVERequest<QemuVMStopRequest> {

    @SerializedName("migratedfrom")
    String migratedFrom;
    @SerializedName("keepActive")
    Integer keepActive;
    @SerializedName("skiplock")
    Integer skipLock;
    Integer timeout;

    public QemuVMStopRequest setKeepActive(Boolean keepActive) {
        this.keepActive = keepActive == null ? null : (keepActive ? 1 : 0);
        return this;
    }

    public QemuVMStopRequest setSkipLock(Boolean skipLock) {
        this.skipLock = skipLock == null ? null : (skipLock ? 1 : 0);
        return this;
    }

}
