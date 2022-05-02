package com.lumaserv.proxmox.ve.model.firewall;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FirewallIPSet {

    String name;
    String digest;
    String comment;

}
