package com.lumaserv.proxmox.ve.request.storage;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StorageGetRequest extends ProxMoxVERequest<StorageGetRequest> {

    String type;

}
