package com.lumaserv.proxmox.ve.request;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class ProxMoxVERequest<T extends ProxMoxVERequest<?>> {

    @Getter @Setter
    transient Map<String, String> additionalParameters = new HashMap<>();

    public T set(String key, String value) {
        additionalParameters.put(key, value);
        return (T) this;
    }

}
