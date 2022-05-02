package com.lumaserv.proxmox.ve.request.nodes.storage;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StorageVolumeUpdateRequest extends ProxMoxVERequest<StorageVolumeUpdateRequest> {

    String notes;

}
