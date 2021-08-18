package com.lumaserv.proxmox.ve.request.sdn;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.AccessLevel;
import lombok.Setter;

@Setter
public class SDNVNetCreateRequest extends ProxMoxVERequest<SDNVNetCreateRequest> {

    @SerializedName("vnet")
    String name;
    String zone;
    String alias;
    Integer tag;
    @Setter(AccessLevel.NONE)
    String type = "vnet";
    @SerializedName("vlanaware")
    Integer vlanAware;

    public SDNVNetCreateRequest setVlanAware(Boolean vlanAware) {
        this.vlanAware = vlanAware == null ? null : (vlanAware ? 1 : 0);
        return this;
    }

}
