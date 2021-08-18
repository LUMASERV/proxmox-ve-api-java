package com.lumaserv.proxmox.ve.request.storage;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class StorageGetRequest extends ProxMoxVERequest<StorageGetRequest> {

    String type;

}
