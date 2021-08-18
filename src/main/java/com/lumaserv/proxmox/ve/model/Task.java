package com.lumaserv.proxmox.ve.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Task {

    String id;
    @SerializedName("upid")
    String upId;
    String node;
    @SerializedName("endtime")
    Long endTime;
    @SerializedName("starttime")
    Long startTime;
    @SerializedName("pstart")
    Long pStart;
    String type;
    String user;
    String status;
    @SerializedName("exitstatus")
    String exitStatus;
    Integer pid;

}
