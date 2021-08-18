package com.lumaserv.proxmox.ve.request.nodes.storage;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class StorageVolumeCreateRequest extends ProxMoxVERequest<StorageVolumeCreateRequest> {

    @SerializedName("filename")
    String fileName;
    String size;
    @SerializedName("vmid")
    Integer vmId;
    String format;

}
