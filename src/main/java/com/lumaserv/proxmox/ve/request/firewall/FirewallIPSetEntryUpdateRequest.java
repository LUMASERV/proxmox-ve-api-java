package com.lumaserv.proxmox.ve.request.firewall;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class FirewallIPSetEntryUpdateRequest extends ProxMoxVERequest<FirewallIPSetEntryUpdateRequest> {

    String comment;
    String digest;
    @MapperOptions(name = "nomatch")
    Integer noMatch;

    public FirewallIPSetEntryUpdateRequest setNoMatch(Boolean noMatch) {
        this.noMatch = noMatch == null ? null : (noMatch ? 1 : 0);
        return this;
    }

}
