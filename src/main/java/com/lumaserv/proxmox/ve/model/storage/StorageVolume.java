package com.lumaserv.proxmox.ve.model.storage;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class StorageVolume {

    @MapperOptions(name = "volid")
    String id;
    String name;
    String format;
    String content;
    @MapperOptions(name = "vmid")
    Integer vmId;
    Long size;

}
