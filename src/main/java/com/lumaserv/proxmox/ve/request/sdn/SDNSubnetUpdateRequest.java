package com.lumaserv.proxmox.ve.request.sdn;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class SDNSubnetUpdateRequest extends ProxMoxVERequest<SDNSubnetUpdateRequest> {

    String delete;
    String digest;
    @MapperOptions(name = "dnszoneprefix")
    String dnsZonePrefix;
    String gateway;
    Integer snat;
    String vnet;

    public SDNSubnetUpdateRequest setSnat(Boolean snat) {
        this.snat = snat == null ? null : (snat ? 1 : 0);
        return this;
    }

}
