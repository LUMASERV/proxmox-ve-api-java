package com.lumaserv.proxmox.ve.request.nodes.storage;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class StorageVolumeUpdateRequest extends ProxMoxVERequest<StorageVolumeUpdateRequest> {

    String notes;

}
