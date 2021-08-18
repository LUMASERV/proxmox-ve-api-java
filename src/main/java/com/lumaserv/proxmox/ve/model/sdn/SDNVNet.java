package com.lumaserv.proxmox.ve.model.sdn;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class SDNVNet {

    @SerializedName("vnet")
    String name;
    @SerializedName("vlanaware")
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
