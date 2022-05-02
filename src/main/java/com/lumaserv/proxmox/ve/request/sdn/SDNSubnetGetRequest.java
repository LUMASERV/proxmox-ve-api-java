package com.lumaserv.proxmox.ve.request.sdn;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SDNSubnetGetRequest extends ProxMoxVERequest<SDNSubnetGetRequest> {

    Integer pending;
    Integer running;

    public SDNSubnetGetRequest setPending(Boolean pending) {
        this.pending = pending == null ? null : (pending ? 1 : 0);
        return this;
    }

    public SDNSubnetGetRequest setRunning(Boolean running) {
        this.running = running == null ? null : (running ? 1 : 0);
        return this;
    }

}
