package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMResumeRequest extends ProxMoxVERequest<QemuVMResumeRequest> {

    @SerializedName("nocheck")
    Integer noCheck;
    @SerializedName("skiplock")
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
