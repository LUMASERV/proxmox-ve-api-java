package com.lumaserv.proxmox.ve.request.nodes.storage;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class StorageVolumeGetRequest extends ProxMoxVERequest<StorageVolumeGetRequest> {

    String content;
    @MapperOptions(name = "vmid")
    Integer vmId;

}
