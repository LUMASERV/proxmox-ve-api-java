package com.lumaserv.proxmox.ve.model.firewall;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
@Setter
public class FirewallOptions {

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

    public Boolean getDhcp() {
        return dhcp == null ? null : (dhcp > 0);
    }

    public boolean isDhcp() {
        return dhcp != null && (dhcp > 0);
    }

    public Boolean getEnable() {
        return enable == null ? null : (enable > 0);
    }

    public boolean isEnabled() {
        return enable != null && (enable > 0);
    }

    public Boolean getIpFilter() {
        return ipFilter == null ? null : (ipFilter > 0);
    }

    public boolean isIpFilter() {
        return ipFilter != null && (ipFilter > 0);
    }

    public Boolean getMacFilter() {
        return macFilter == null ? null : (macFilter > 0);
    }

    public boolean isMacFilter() {
        return macFilter != null && (macFilter > 0);
    }

    public Boolean getNdp() {
        return ndp == null ? null : (ndp > 0);
    }

    public boolean isNdp() {
        return ndp != null && (ndp > 0);
    }

    public Boolean getRouterAdvertisement() {
        return routerAdvertisement == null ? null : (routerAdvertisement > 0);
    }

    public boolean isRouterAdvertisement() {
        return routerAdvertisement != null && (routerAdvertisement > 0);
    }

}
