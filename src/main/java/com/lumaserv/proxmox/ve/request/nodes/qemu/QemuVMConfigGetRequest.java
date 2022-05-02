package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class QemuVMConfigGetRequest extends ProxMoxVERequest<QemuVMConfigGetRequest> {

    Integer current;
    String snapshot;

    public QemuVMConfigGetRequest setCurrent(Boolean current) {
        this.current = current == null ? null : (current ? 1 : 0);
        return this;
    }

}
