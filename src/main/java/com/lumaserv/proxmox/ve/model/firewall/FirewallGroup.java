package com.lumaserv.proxmox.ve.model.firewall;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class FirewallGroup {

    @SerializedName("group")
    String name;
    String digest;
    String comment;

}
