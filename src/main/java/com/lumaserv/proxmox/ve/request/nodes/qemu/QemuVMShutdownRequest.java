package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMShutdownRequest extends ProxMoxVERequest<QemuVMShutdownRequest> {

    @SerializedName("forceStop")
    Integer forceStop;
    @SerializedName("keepActive")
    Integer keepActive;
    @SerializedName("skiplock")
    Integer skipLock;
    Integer timeout;

    public QemuVMShutdownRequest setForceStop(Boolean forceStop) {
        this.forceStop = forceStop == null ? null : (forceStop ? 1 : 0);
        return this;
    }

    public QemuVMShutdownRequest setKeepActive(Boolean keepActive) {
        this.keepActive = keepActive == null ? null : (keepActive ? 1 : 0);
        return this;
    }

    public QemuVMShutdownRequest setSkipLock(Boolean skipLock) {
        this.skipLock = skipLock == null ? null : (skipLock ? 1 : 0);
        return this;
    }

}
