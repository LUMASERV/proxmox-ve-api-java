package com.lumaserv.proxmox.ve.model.resource;

import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.Additional;

@Getter
public class UnknownResource extends Resource {

    @Additional
    AbstractObject properties;

}
