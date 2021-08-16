package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMMigrateRequest extends ProxMoxVERequest<QemuVMMigrateRequest> {

    String target;
    @SerializedName("bwlimit")
    Integer bandwidthLimit;
    Integer force;
    String migrationNetwork;
    String migrationType;
    Integer online;
    @SerializedName("targetstorage")
    String targetStorage;
    @SerializedName("with-local-disks")
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
