package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class QemuVMResumeRequest extends ProxMoxVERequest<QemuVMResumeRequest> {

    @MapperOptions(name = "nocheck")
    Integer noCheck;
    @MapperOptions(name = "skiplock")
    Integer skipLock;

    public QemuVMResumeRequest setNoCheck(Boolean noCheck) {
        this.noCheck = noCheck == null ? null : (noCheck ? 1 : 0);
        return this;
    }

    public QemuVMResumeRequest setSkipLock(Boolean skipLock) {
        this.skipLock = skipLock == null ? null : (skipLock ? 1 : 0);
        return this;
    }

}
