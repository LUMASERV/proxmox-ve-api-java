package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class QemuVMMigrateRequest extends ProxMoxVERequest<QemuVMMigrateRequest> {

    String target;
    @MapperOptions(name = "bwlimit")
    Integer bandwidthLimit;
    Integer force;
    String migrationNetwork;
    String migrationType;
    Integer online;
    @MapperOptions(name = "targetstorage")
    String targetStorage;
    @MapperOptions(name = "with-local-disks")
    Integer withLocalDisks;

    public QemuVMMigrateRequest setForce(Boolean force) {
        this.force = force == null ? null : (force ? 1 : 0);
        return this;
    }

    public QemuVMMigrateRequest setOnline(Boolean online) {
        this.online = online == null ? null : (online ? 1 : 0);
        return this;
    }

    public QemuVMMigrateRequest setWithLocalDisks(Boolean withLocalDisks) {
        this.withLocalDisks = withLocalDisks == null ? null : (withLocalDisks ? 1 : 0);
        return this;
    }

}
