package com.lumaserv.proxmox.ve.request.sdn;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.AccessLevel;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class SDNSubnetCreateRequest extends ProxMoxVERequest<SDNSubnetCreateRequest> {

    @MapperOptions(name = "subnet")
    String cidr;
    @Setter(AccessLevel.NONE)
    String type = "subnet";
    @MapperOptions(name = "dnszoneprefix")
    String dnsZonePrefix;
    String gateway;
    Integer snat;

    public SDNSubnetCreateRequest setSnat(Boolean snat) {
        this.snat = snat == null ? null : (snat ? 1 : 0);
        return this;
    }

}
