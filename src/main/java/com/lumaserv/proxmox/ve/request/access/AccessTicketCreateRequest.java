package com.lumaserv.proxmox.ve.request.access;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AccessTicketCreateRequest extends ProxMoxVERequest<AccessTicketCreateRequest> {

    String username;
    String password;
    String otp;
    String path;
    String privs;
    String realm;

}
