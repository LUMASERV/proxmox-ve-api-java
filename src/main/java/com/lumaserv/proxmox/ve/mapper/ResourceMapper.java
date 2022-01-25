package com.lumaserv.proxmox.ve.mapper;

import com.lumaserv.proxmox.ve.model.resource.NodeResource;
import com.lumaserv.proxmox.ve.model.resource.QemuVMResource;
import com.lumaserv.proxmox.ve.model.resource.Resource;
import com.lumaserv.proxmox.ve.model.resource.UnknownResource;
import org.javawebstack.abstractdata.AbstractElement;
import org.javawebstack.abstractdata.mapper.MapperContext;
import org.javawebstack.abstractdata.mapper.MapperTypeAdapter;
import org.javawebstack.abstractdata.mapper.exception.MapperException;
import org.javawebstack.abstractdata.mapper.exception.MapperWrongTypeException;
import org.javawebstack.abstractdata.util.Helpers;

public class ResourceMapper implements MapperTypeAdapter {

    public AbstractElement toAbstract(MapperContext mapperContext, Object o) throws MapperException {
        return mapperContext.getMapper().map(o);
    }

    public Object fromAbstract(MapperContext mapperContext, AbstractElement element, Class<?> type) throws MapperException {
        if(element == null)
            return null;
        if(element.getType() != AbstractElement.Type.OBJECT)
            throw new MapperWrongTypeException(mapperContext.getField().getName(), "object", Helpers.typeName(element));
        if(!element.object().has("type") || !element.object().get("type").isString())
            throw new MapperException("Missing or invalid resource type");
        switch (element.object().string("type")) {
            case "qemu":
                return mapperContext.getMapper().map(element, QemuVMResource.class);
            case "node":
                return mapperContext.getMapper().map(element, NodeResource.class);
            default:
                return mapperContext.getMapper().map(element, UnknownResource.class);
        }
    }

    public Class<?>[] getSupportedTypes() {
        return new Class[] {
                Resource.class
        };
    }

}
