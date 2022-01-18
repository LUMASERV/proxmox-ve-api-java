package com.lumaserv.proxmox.ve.model.sdn;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class SDNVNet {

    @MapperOptions(name = "vnet")
    String name;
    @MapperOptions(name = "vlanaware")
    Integer vlanAware;
    String zone;
    String digest;
    Integer tag;
    String type;
    String alias;

    public Boolean getVlanAware() {
        return vlanAware == null ? null : (vlanAware > 0);
    }

    public boolean isVlanAware() {
        return vlanAware != null && (vlanAware > 0);
    }

}
