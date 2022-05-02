package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class QemuVMStartRequest extends ProxMoxVERequest<QemuVMStartRequest> {

    @MapperOptions(name = "skiplock")
    Integer skipLock;
    Integer timeout;
    @MapperOptions(name = "force-cpu")
    String forceCpu;
    String machine;
    @MapperOptions(name = "migratedfrom")
    String migratedFrom;
    String migrationNetwork;
    String migrationType;
    @MapperOptions(name = "stateuri")
    String stateUri;
    @MapperOptions(name = "targetstorage")
    String targetStorage;

    public QemuVMStartRequest setSkipLock(Boolean skipLock) {
        this.skipLock = skipLock == null ? null : (skipLock ? 1 : 0);
        return this;
    }

}
