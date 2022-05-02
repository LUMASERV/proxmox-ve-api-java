package com.lumaserv.proxmox.ve.response.nodes.qemu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QemuVMVNCProxyResponse {

    String cert;
    Integer port;
    String ticket;
    String upid;
    String user;
    String password;

}
