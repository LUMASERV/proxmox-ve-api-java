package com.lumaserv.proxmox.ve.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class TaskLogLine {

    @SerializedName("n")
    Integer line;
    @SerializedName("t")
    String text;

}
