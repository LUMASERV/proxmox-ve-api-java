package com.lumaserv.proxmox.ve.request.firewall;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class FirewallIPSetEntryCreateRequest extends ProxMoxVERequest<FirewallIPSetEntryCreateRequest> {

    String cidr;
    String comment;
    @MapperOptions(name = "nomatch")
    Integer noMatch;

    public FirewallIPSetEntryCreateRequest setNoMatch(Boolean noMatch) {
        this.noMatch = noMatch == null ? null : (noMatch ? 1 : 0);
        return this;
    }

}
