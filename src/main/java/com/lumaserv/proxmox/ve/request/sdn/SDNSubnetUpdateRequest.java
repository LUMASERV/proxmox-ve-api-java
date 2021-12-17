package com.lumaserv.proxmox.ve.request.sdn;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class SDNSubnetUpdateRequest extends ProxMoxVERequest<SDNSubnetUpdateRequest> {

    String delete;
    String digest;
    @SerializedName("dnszoneprefix")
    String dnsZonePrefix;
    String gateway;
    Integer snat;
    String vnet;

    public SDNSubnetUpdateRequest setSnat(Boolean snat) {
        this.snat = snat == null ? null : (snat ? 1 : 0);
        return this;
    }

}
