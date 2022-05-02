package com.lumaserv.proxmox.ve.model;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
@Setter
public class TaskLogLine {

    @MapperOptions(name = "n")
    Integer line;
    @MapperOptions(name = "t")
    String text;

}
