package com.lumaserv.proxmox.ve.request.nodes.storage;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class StorageVolumeGetRequest extends ProxMoxVERequest<StorageVolumeGetRequest> {

    String content;
    @MapperOptions(name = "vmid")
    Integer vmId;

}
