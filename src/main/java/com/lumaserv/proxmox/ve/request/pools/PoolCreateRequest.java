package com.lumaserv.proxmox.ve.request.pools;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class PoolCreateRequest extends ProxMoxVERequest<PoolCreateRequest> {

    @SerializedName("poolid")
    String id;
    String comment;

}
