package com.lumaserv.proxmox.ve.request.nodes;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
@Setter
public class TaskGetRequest extends ProxMoxVERequest<TaskGetRequest> {

    Integer errors;
    Integer limit;
    Long since;
    Long until;
    @MapperOptions(name = "vmid")
    Integer vmId;
    String source;
    Long start;
    @MapperOptions(name = "statusfilter")
    String statusFilter;
    @MapperOptions(name = "typefilter")
    String typeFilter;
    @MapperOptions(name = "userfilter")
    String userFilter;

}
