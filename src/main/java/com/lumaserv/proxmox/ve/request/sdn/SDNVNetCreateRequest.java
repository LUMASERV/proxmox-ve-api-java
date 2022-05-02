package com.lumaserv.proxmox.ve.request.sdn;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class SDNVNetCreateRequest extends ProxMoxVERequest<SDNVNetCreateRequest> {

    @MapperOptions(name = "vnet")
    String name;
    String zone;
    String alias;
    Integer tag;
    @Setter(AccessLevel.NONE)
    String type = "vnet";
    @MapperOptions(name = "vlanaware")
    Integer vlanAware;

    public SDNVNetCreateRequest setVlanAware(Boolean vlanAware) {
        this.vlanAware = vlanAware == null ? null : (vlanAware ? 1 : 0);
        return this;
    }

}
