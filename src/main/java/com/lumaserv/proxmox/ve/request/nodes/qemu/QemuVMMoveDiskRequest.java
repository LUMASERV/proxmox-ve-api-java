package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class QemuVMMoveDiskRequest extends ProxMoxVERequest<QemuVMMoveDiskRequest> {

    String disk;
    @MapperOptions(name = "bwlimit")
    Integer bandwidthLimit;
    String format;
    String storage;
    @MapperOptions(name = "target-digest")
    String targetDigest;
    @MapperOptions(name = "target-disk")
    String targetDisk;
    @MapperOptions(name = "target-vmid")
    Integer targetVMId;
    Integer delete;

    public QemuVMMoveDiskRequest setDelete(Boolean delete) {
        this.delete = delete == null ? null : (delete ? 1 : 0);
        return this;
    }

}
