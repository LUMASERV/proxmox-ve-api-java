package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMRebootRequest extends ProxMoxVERequest<QemuVMRebootRequest> {

    Integer timeout;

}
