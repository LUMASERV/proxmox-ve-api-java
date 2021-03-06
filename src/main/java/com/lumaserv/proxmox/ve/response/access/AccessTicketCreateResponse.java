package com.lumaserv.proxmox.ve.response.access;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
@Setter
public class AccessTicketCreateResponse {

    String username;
    @MapperOptions(name = "CSRFPreventionToken")
    String csrfPreventionToken;
    @MapperOptions(name = "clustername")
    String clusterName;
    String ticket;

}
