package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class QemuVMCloneRequest extends ProxMoxVERequest<QemuVMCloneRequest> {

    @MapperOptions(name = "newid")
    Integer newId;
    @MapperOptions(name = "bwlimit")
    Integer bandwidthLimit;
    String description;
    String format;
    Integer full;
    String name;
    String pool;
    @MapperOptions(name = "snapname")
    String snapshotName;
    String storage;
    String target;

    public QemuVMCloneRequest setFull(Boolean full) {
        this.full = full == null ? null : (full ? 1 : 0);
        return this;
    }

}
