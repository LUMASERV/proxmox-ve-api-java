package com.lumaserv.proxmox.ve.request.firewall;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class FirewallGroupCreateRequest extends ProxMoxVERequest<FirewallGroupCreateRequest> {

    @MapperOptions(name = "group")
    String name;
    String digest;
    String comment;
    String rename;

}
