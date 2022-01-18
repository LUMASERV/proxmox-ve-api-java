package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class QemuVMDeleteRequest extends ProxMoxVERequest<QemuVMDeleteRequest> {

    @MapperOptions(name = "destroy-unreferenced-disks")
    Integer destroyUnreferencedDisks;
    Integer purge;
    @MapperOptions(name = "skiplock")
    String skipLock;

    public QemuVMDeleteRequest setDestroyUnreferencedDisks(Boolean destroyUnreferencedDisks) {
        this.destroyUnreferencedDisks = destroyUnreferencedDisks == null ? null : (destroyUnreferencedDisks ? 1 : 0);
        return this;
    }

    public QemuVMDeleteRequest setPurge(Boolean purge) {
        this.purge = purge == null ? null : (purge ? 1 : 0);
        return this;
    }

}
