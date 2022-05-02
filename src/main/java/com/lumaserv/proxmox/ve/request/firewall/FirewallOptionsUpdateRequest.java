package com.lumaserv.proxmox.ve.request.firewall;

import com.lumaserv.proxmox.ve.model.firewall.FirewallRule;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
@Getter
public class FirewallOptionsUpdateRequest extends ProxMoxVERequest<FirewallOptionsUpdateRequest> {

    Integer dhcp;
    Integer enable;
    @MapperOptions(name = "ipfilter")
    Integer ipFilter;
    String logLevelIn;
    String logLevelOut;
    @MapperOptions(name = "macfilter")
    Integer macFilter;
    Integer ndp;
    FirewallRule.Action policyIn;
    FirewallRule.Action policyOut;
    @MapperOptions(name = "radv")
    Integer routerAdvertisement;

    public FirewallOptionsUpdateRequest setDhcp(Boolean dhcp) {
        this.dhcp = dhcp == null ? null : (dhcp ? 1 : 0);
        return this;
    }

    public FirewallOptionsUpdateRequest setEnable(Boolean enable) {
        this.enable = enable == null ? null : (enable ? 1 : 0);
        return this;
    }

    public FirewallOptionsUpdateRequest setIpFilter(Boolean ipFilter) {
        this.ipFilter = ipFilter == null ? null : (ipFilter ? 1 : 0);
        return this;
    }

    public FirewallOptionsUpdateRequest setMacFilter(Boolean macFilter) {
        this.macFilter = macFilter == null ? null : (macFilter ? 1 : 0);
        return this;
    }

    public FirewallOptionsUpdateRequest setNdp(Boolean ndp) {
        this.ndp = ndp == null ? null : (ndp ? 1 : 0);
        return this;
    }

    public FirewallOptionsUpdateRequest setRouterAdvertisement(Boolean routerAdvertisement) {
        this.routerAdvertisement = routerAdvertisement == null ? null : (routerAdvertisement ? 1 : 0);
        return this;
    }

}
