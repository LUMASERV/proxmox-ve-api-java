package com.lumaserv.proxmox.ve.response.nodes.qemu;

import lombok.Getter;

@Getter
public class QemuVMVNCProxyResponse {

    String cert;
    Integer port;
    String ticket;
    String upid;
    String user;
    String password;

}
