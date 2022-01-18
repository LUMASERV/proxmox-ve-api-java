package com.lumaserv.proxmox.ve.model;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class Task {

    String id;
    @MapperOptions(name = "upid")
    String upId;
    String node;
    @MapperOptions(name = "endtime")
    Long endTime;
    @MapperOptions(name = "starttime")
    Long startTime;
    @MapperOptions(name = "pstart")
    Long pStart;
    String type;
    String user;
    String status;
    @MapperOptions(name = "exitstatus")
    String exitStatus;
    Integer pid;

}
