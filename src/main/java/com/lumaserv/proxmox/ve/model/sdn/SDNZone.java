package com.lumaserv.proxmox.ve.model.sdn;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class SDNZone {

    @SerializedName("zone")
    String name;
    String nodes;
    String ipam;
    String digest;
    String peers;
    String type;
    Integer mtu;
    String dns;
    @SerializedName("dnszone")
    String dnsZone;
    String pending;
    String state;
    @SerializedName("reversedns")
    String reverseDns;

}
