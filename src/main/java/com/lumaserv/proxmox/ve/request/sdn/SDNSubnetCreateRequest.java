package com.lumaserv.proxmox.ve.request.sdn;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.AccessLevel;
import lombok.Setter;

@Setter
public class SDNSubnetCreateRequest extends ProxMoxVERequest<SDNSubnetCreateRequest> {

    @SerializedName("subnet")
    String cidr;
    @Setter(AccessLevel.NONE)
    String type = "subnet";
    @SerializedName("dnszoneprefix")
    String dnsZonePrefix;
    String gateway;
    Integer snat;

    public SDNSubnetCreateRequest setSnat(Boolean snat) {
        this.snat = snat == null ? null : (snat ? 1 : 0);
        return this;
    }

}
