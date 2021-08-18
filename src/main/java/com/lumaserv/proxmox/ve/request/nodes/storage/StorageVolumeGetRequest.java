package com.lumaserv.proxmox.ve.request.nodes.storage;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class StorageVolumeGetRequest extends ProxMoxVERequest<StorageVolumeGetRequest> {

    String content;
    @SerializedName("vmid")
    Integer vmId;

}
