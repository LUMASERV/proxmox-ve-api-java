package com.lumaserv.proxmox.ve;

import lombok.Getter;
import org.javawebstack.httpclient.HTTPRequest;

public class ProxMoxVEException extends Exception {

    @Getter
    final HTTPRequest request;

    public ProxMoxVEException(HTTPRequest request) {
        super("[Status " + request.status() + "] " + request.string());
        this.request = request;
    }

}
