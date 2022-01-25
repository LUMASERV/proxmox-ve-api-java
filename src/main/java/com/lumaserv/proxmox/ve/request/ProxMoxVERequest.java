package com.lumaserv.proxmox.ve.request;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.Additional;

import java.util.HashMap;
import java.util.Map;

public class ProxMoxVERequest<T extends ProxMoxVERequest<?>> {

    @Getter @Setter
    @Additional
    AbstractObject additionalParameters = new AbstractObject();

    public T set(String key, String value) {
        if(value == null)
            additionalParameters.remove(key);
        else
            additionalParameters.set(key, value);
        return (T) this;
    }

}
