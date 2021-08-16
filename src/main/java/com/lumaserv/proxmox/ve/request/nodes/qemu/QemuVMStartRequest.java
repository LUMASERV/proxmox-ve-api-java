package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMStartRequest extends ProxMoxVERequest<QemuVMStartRequest> {

    @SerializedName("skiplock")
    Integer skipLock;
    Integer timeout;
    @SerializedName("force-cpu")
    String forceCpu;
    String machine;
    @SerializedName("migratedfrom")
    String migratedFrom;
    String migrationNetwork;
    String migrationType;
    @SerializedName("stateuri")
    String stateUri;
    @SerializedName("targetstorage")
    String targetStorage;

    public QemuVMStartRequest setSkipLock(Boolean skipLock) {
        this.skipLock = skipLock == null ? null : (skipLock ? 1 : 0);
        return this;
    }

}
