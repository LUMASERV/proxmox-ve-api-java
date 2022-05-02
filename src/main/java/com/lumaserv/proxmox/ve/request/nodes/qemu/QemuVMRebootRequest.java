package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class QemuVMRebootRequest extends ProxMoxVERequest<QemuVMRebootRequest> {

    Integer timeout;

}
