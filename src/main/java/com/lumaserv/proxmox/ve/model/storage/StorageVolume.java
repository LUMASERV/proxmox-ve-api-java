package com.lumaserv.proxmox.ve.model.storage;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class StorageVolume {

    @SerializedName("volid")
    String id;
    String name;
    String format;
    String content;
    @SerializedName("vmid")
    Integer vmId;
    Long size;

}
