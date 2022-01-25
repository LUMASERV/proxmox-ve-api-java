package com.lumaserv.proxmox.ve.request.nodes;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class RRDDataGetRequest extends ProxMoxVERequest<RRDDataGetRequest> {

    String timeframe;
    @MapperOptions(name = "cf")
    ConsolidationFunction consolidationFunction;

    public enum ConsolidationFunction {

        AVERAGE,
        MAX

    }

}
