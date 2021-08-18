package com.lumaserv.proxmox.ve.request.firewall;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class FirewallIPSetEntryCreateRequest extends ProxMoxVERequest<FirewallIPSetEntryCreateRequest> {

    String cidr;
    String comment;
    @SerializedName("nomatch")
    Integer noMatch;

    public FirewallIPSetEntryCreateRequest setNoMatch(Boolean noMatch) {
        this.noMatch = noMatch == null ? null : (noMatch ? 1 : 0);
        return this;
    }

}
