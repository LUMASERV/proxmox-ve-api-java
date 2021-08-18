package com.lumaserv.proxmox.ve.request.sdn;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.AccessLevel;
import lombok.Setter;

@Setter
public class SDNVNetUpdateRequest extends ProxMoxVERequest<SDNVNetUpdateRequest> {

    String delete;
    String digest;
    String zone;
    String alias;
    Integer tag;
    @SerializedName("vlanaware")
    Integer vlanAware;

    public SDNVNetUpdateRequest setVlanAware(Boolean vlanAware) {
        this.vlanAware = vlanAware == null ? null : (vlanAware ? 1 : 0);
        return this;
    }

}
