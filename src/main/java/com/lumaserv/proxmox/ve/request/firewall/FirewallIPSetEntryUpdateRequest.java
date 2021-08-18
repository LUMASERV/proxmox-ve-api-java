package com.lumaserv.proxmox.ve.request.firewall;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class FirewallIPSetEntryUpdateRequest extends ProxMoxVERequest<FirewallIPSetEntryUpdateRequest> {

    String comment;
    String digest;
    @SerializedName("nomatch")
    Integer noMatch;

    public FirewallIPSetEntryUpdateRequest setNoMatch(Boolean noMatch) {
        this.noMatch = noMatch == null ? null : (noMatch ? 1 : 0);
        return this;
    }

}
