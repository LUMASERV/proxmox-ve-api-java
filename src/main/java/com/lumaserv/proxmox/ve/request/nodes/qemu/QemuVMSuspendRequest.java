package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class QemuVMSuspendRequest extends ProxMoxVERequest<QemuVMSuspendRequest> {

    @MapperOptions(name = "skiplock")
    Integer skipLock;
    @MapperOptions(name = "statestorage")
    String stateStorage;
    @MapperOptions(name = "todisk")
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
