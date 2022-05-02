package com.lumaserv.proxmox.ve.request.firewall;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FirewallIPSetCreateRequest extends ProxMoxVERequest<FirewallIPSetCreateRequest> {

    String name;
    String comment;
    String digest;
    String rename;

}
