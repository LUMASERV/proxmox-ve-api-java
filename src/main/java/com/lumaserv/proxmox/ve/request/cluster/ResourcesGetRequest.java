package com.lumaserv.proxmox.ve.request.cluster;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResourcesGetRequest extends ProxMoxVERequest<ResourcesGetRequest> {

    String type;

}
