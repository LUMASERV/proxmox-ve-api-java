package com.lumaserv.proxmox.ve.request.sdn;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class SDNZoneUpdateRequest extends ProxMoxVERequest<SDNZoneUpdateRequest> {

    String digest;
    String delete;
    String bridge;
    String controller;
    String dns;
    @MapperOptions(name = "dnszone")
    String dnsZone;
    @MapperOptions(name = "dp-id")
    Integer dataPlaneId;
    @MapperOptions(name = "exitnodes")
    String exitNodes;
    String ipam;
    String mac;
    Integer mtu;
    String nodes;
    String peers;
    @MapperOptions(name = "reversedns")
    String reverseDns;
    Integer tag;
    @MapperOptions(name = "vlan-protocol")
    String vlanProtocol;
    @MapperOptions(name = "vrf-vxlan")
    Integer vrfVxlan;

}
