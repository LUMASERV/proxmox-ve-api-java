package com.lumaserv.proxmox.ve.response.access;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class AccessTicketCreateResponse {

    String username;
    @SerializedName("CSRFPreventionToken")
    String csrfPreventionToken;
    @SerializedName("clustername")
    String clusterName;
    String ticket;

}
