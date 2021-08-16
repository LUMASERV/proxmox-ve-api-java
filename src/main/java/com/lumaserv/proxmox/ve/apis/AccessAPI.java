package com.lumaserv.proxmox.ve.apis;

import com.lumaserv.proxmox.ve.ProxMoxVEClient;
import com.lumaserv.proxmox.ve.ProxMoxVEException;
import com.lumaserv.proxmox.ve.request.access.AccessTicketCreateRequest;
import com.lumaserv.proxmox.ve.response.access.AccessTicketCreateResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AccessAPI {

    final ProxMoxVEClient client;

    public AccessTicketCreateResponse createTicket(AccessTicketCreateRequest request) throws ProxMoxVEException {
        return client.request("POST", "/access/ticket", request, AccessTicketCreateResponse.class);
    }

}
