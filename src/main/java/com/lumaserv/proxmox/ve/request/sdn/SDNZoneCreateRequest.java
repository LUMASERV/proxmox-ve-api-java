package com.lumaserv.proxmox.ve.request.sdn;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class SDNZoneCreateRequest extends ProxMoxVERequest<SDNZoneCreateRequest> {

    @SerializedName("zone")
    String name;
    String type;
    String bridge;
    String controller;
    String dns;
    @SerializedName("dnszone")
    String dnsZone;
    @SerializedName("dp-id")
    Integer dataPlaneId;
    @SerializedName("exitnodes")
    String exitNodes;
    String ipam;
    String mac;
    Integer mtu;
    String nodes;
    String peers;
    @SerializedName("reversedns")
    String reverseDns;
    Integer tag;
    @SerializedName("vlan-protocol")
    String vlanProtocol;
    @SerializedName("vrf-vxlan")
    Integer vrfVxlan;

}
