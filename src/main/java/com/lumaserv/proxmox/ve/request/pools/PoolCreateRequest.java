package com.lumaserv.proxmox.ve.request.pools;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class PoolCreateRequest extends ProxMoxVERequest<PoolCreateRequest> {

    @MapperOptions(name = "poolid")
    String id;
    String comment;

}
