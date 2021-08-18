package com.lumaserv.proxmox.ve.request.sdn;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;

public class SDNZoneGetRequest extends ProxMoxVERequest<SDNZoneGetRequest> {

    Integer pending;
    Integer running;

    public SDNZoneGetRequest setPending(Boolean pending) {
        this.pending = pending == null ? null : (pending ? 1 : 0);
        return this;
    }

    public SDNZoneGetRequest setRunning(Boolean running) {
        this.running = running == null ? null : (running ? 1 : 0);
        return this;
    }

}
