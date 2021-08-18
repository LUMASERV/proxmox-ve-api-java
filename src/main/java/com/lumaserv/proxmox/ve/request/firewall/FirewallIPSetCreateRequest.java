package com.lumaserv.proxmox.ve.request.firewall;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class FirewallIPSetCreateRequest extends ProxMoxVERequest<FirewallIPSetCreateRequest> {

    String name;
    String comment;
    String digest;
    String rename;

}
