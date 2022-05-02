package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.List;

@Setter
@Getter
public class QemuVMUnlinkRequest extends ProxMoxVERequest<QemuVMUnlinkRequest> {

    @MapperOptions(name = "idlist")
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
