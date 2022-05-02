package com.lumaserv.proxmox.ve.model.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Resource {

    String type;
    String id;

}
