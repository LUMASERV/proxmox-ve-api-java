package com.lumaserv.proxmox.ve.request.sdn;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class SDNVNetUpdateRequest extends ProxMoxVERequest<SDNVNetUpdateRequest> {

    String delete;
    String digest;
    String zone;
    String alias;
    Integer tag;
    @MapperOptions(name = "vlanaware")
    Integer vlanAware;

    public SDNVNetUpdateRequest setVlanAware(Boolean vlanAware) {
        this.vlanAware = vlanAware == null ? null : (vlanAware ? 1 : 0);
        return this;
    }

}
