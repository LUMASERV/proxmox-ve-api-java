package com.lumaserv.proxmox.ve.model.sdn;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class SDNSubnet {

    String vnet;
    @SerializedName("subnet")
    String name;
    String zone;
    String digest;
    String cidr;
    String type;
    String gateway;
    String network;
    String mask;

}
