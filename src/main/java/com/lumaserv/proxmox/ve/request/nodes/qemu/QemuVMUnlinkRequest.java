package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

import java.util.List;

@Setter
public class QemuVMUnlinkRequest extends ProxMoxVERequest<QemuVMUnlinkRequest> {

    @SerializedName("idlist")
    String ids;
    Integer force;

    public QemuVMUnlinkRequest setIds(List<String> ids) {
        this.ids = String.join(",", ids);
        return this;
    }

    public QemuVMUnlinkRequest setIds(String... ids) {
        this.ids = String.join(",", ids);
        return this;
    }

    public QemuVMUnlinkRequest setForce(Boolean force) {
        this.force = force == null ? null : (force ? 1 : 0);
        return this;
    }

}
