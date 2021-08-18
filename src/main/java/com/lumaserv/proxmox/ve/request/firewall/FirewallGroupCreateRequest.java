package com.lumaserv.proxmox.ve.request.firewall;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class FirewallGroupCreateRequest extends ProxMoxVERequest<FirewallGroupCreateRequest> {

    @SerializedName("group")
    String name;
    String digest;
    String comment;
    String rename;

}
