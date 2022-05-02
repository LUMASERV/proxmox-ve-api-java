package com.lumaserv.proxmox.ve.request.nodes.storage;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NodeStorageGetRequest extends ProxMoxVERequest<NodeStorageGetRequest> {

    String content;
    Integer enabled;
    Integer format;
    String storage;
    String target;

    public NodeStorageGetRequest setEnabled(Boolean enabled) {
        this.enabled = enabled == null ? null : (enabled ? 1 : 0);
        return this;
    }

    public NodeStorageGetRequest setFormat(Boolean format) {
        this.format = format == null ? null : (format ? 1 : 0);
        return this;
    }

}
