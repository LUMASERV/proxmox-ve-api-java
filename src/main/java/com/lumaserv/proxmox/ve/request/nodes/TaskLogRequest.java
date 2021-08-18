package com.lumaserv.proxmox.ve.request.nodes;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class TaskLogRequest extends ProxMoxVERequest<TaskLogRequest> {

    Integer limit;
    Integer start;

}
