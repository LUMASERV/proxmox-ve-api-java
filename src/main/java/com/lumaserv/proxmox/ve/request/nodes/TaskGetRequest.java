package com.lumaserv.proxmox.ve.request.nodes;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;

@Getter
public class TaskGetRequest extends ProxMoxVERequest<TaskGetRequest> {

    Integer errors;
    Integer limit;
    Long since;
    Long until;
    @SerializedName("vmid")
    Integer vmId;
    String source;
    Long start;
    @SerializedName("statusfilter")
    String statusFilter;
    @SerializedName("typefilter")
    String typeFilter;
    @SerializedName("userfilter")
    String userFilter;

}
