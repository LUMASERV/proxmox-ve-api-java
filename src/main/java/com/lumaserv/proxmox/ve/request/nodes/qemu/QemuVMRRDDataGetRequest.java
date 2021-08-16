package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMRRDDataGetRequest extends ProxMoxVERequest<QemuVMRRDDataGetRequest> {

    String timeframe;
    @SerializedName("cf")
    ConsolidationFunction consolidationFunction;

    public enum ConsolidationFunction {

        AVERAGE,
        MAX

    }

}
