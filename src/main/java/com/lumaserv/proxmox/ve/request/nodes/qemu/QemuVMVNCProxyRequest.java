package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

public class QemuVMVNCProxyRequest extends ProxMoxVERequest<QemuVMVNCProxyRequest> {

    Integer websocket;
    @MapperOptions(name = "generate-password")
    Integer generatePassword;

    public QemuVMVNCProxyRequest setWebsocket(Boolean websocket) {
        this.websocket = websocket == null ? null : (websocket ? 1 : 0);
        return this;
    }

    public QemuVMVNCProxyRequest setGeneratePassword(Boolean generatePassword) {
        this.generatePassword = generatePassword == null ? null : (generatePassword ? 1 : 0);
        return this;
    }

}
