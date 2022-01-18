package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class QemuVMStopRequest extends ProxMoxVERequest<QemuVMStopRequest> {

    @MapperOptions(name = "migratedfrom")
    String migratedFrom;
    @MapperOptions(name = "keepActive")
    Integer keepActive;
    @MapperOptions(name = "skiplock")
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
