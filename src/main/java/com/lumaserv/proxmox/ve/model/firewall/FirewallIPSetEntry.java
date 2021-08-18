package com.lumaserv.proxmox.ve.model.firewall;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class FirewallIPSetEntry {

    String cidr;
    String digest;
    String comment;
    @SerializedName("nomatch")
    Boolean noMatch;

}
