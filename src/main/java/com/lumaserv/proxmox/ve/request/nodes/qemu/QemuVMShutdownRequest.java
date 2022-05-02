package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class QemuVMShutdownRequest extends ProxMoxVERequest<QemuVMShutdownRequest> {

    @MapperOptions(name = "forceStop")
    Integer forceStop;
    @MapperOptions(name = "keepActive")
    Integer keepActive;
    @MapperOptions(name = "skiplock")
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
