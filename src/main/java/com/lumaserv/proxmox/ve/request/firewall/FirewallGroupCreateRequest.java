package com.lumaserv.proxmox.ve.request.firewall;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class FirewallGroupCreateRequest extends ProxMoxVERequest<FirewallGroupCreateRequest> {

    @MapperOptions(name = "group")
    String name;
    String digest;
    String comment;
    String rename;

}
