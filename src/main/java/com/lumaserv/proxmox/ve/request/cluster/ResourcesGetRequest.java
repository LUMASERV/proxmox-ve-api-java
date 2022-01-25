package com.lumaserv.proxmox.ve.request.cluster;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class ResourcesGetRequest extends ProxMoxVERequest<ResourcesGetRequest> {

    String type;

}
