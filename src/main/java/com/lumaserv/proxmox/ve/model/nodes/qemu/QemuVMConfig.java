package com.lumaserv.proxmox.ve.model.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.ProxMoxVEClient;
import com.lumaserv.proxmox.ve.util.UrlEncoder;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.HashMap;
import java.util.Map;

@Getter
public class QemuVMConfig {

    String digest;
    Integer acpi;
    String agent;
    String arch;
    String args;
    @SerializedName("audio0")
    String audio;
    Integer autostart;
    Integer balloon;
    String bios;
    @SerializedName("boot")
    String bootOrder;
    @SerializedName("bootdisk")
    String bootDisk;
    String cdrom;
    @SerializedName("cicustom")
    String ciCustom;
    @SerializedName("cipassword")
    String ciPassword;
    @SerializedName("citype")
    String ciType;
    @SerializedName("ciuser")
    String ciUser;
    Integer cores;
    String cpu;
    @SerializedName("cpulimit")
    Double cpuLimit;
    @SerializedName("cpuunits")
    Integer cpuUnits;
    String description;
    @SerializedName("efidisk0")
    String efiDisk;
    Integer freeze;
    @SerializedName("hookscript")
    String hookScript;
    String hotplug;
    String hugepages;
    @SerializedName("ivshmem")
    String interVMSharedMemory;
    @SerializedName("keephugepages")
    Integer keepHugepages;
    String keyboard;
    Integer kvm;
    @SerializedName("localtime")
    Integer localTime;
    String lock;
    String machine;
    Integer memory;
    Double migrateDowntime;
    Integer migrateSpeed;
    String name;
    String nameserver;
    Integer numa;
    @SerializedName("onboot")
    String startOnBoot;
    @SerializedName("ostype")
    String osType;
    Integer protection;
    @SerializedName("reboot")
    Integer allowReboot;
    @SerializedName("rng0")
    String randomNumberGenerator;
    @SerializedName("scsihw")
    String scsiHw;
    @SerializedName("searchdomain")
    String searchDomain;
    Integer shares;
    String smbios1;
    Integer sockets;
    String spiceEnhancements;
    @SerializedName("sshkeys")
    String sshKeys;
    @SerializedName("startdate")
    String startDate;
    String startup;
    Integer tablet;
    String tags;
    @SerializedName("tdf")
    Integer timeDriftFix;
    @SerializedName("template")
    Integer enableTemplate;
    Integer vcpus;
    String vga;
    @SerializedName("vmgenid")
    String vmGenId;
    @SerializedName("vmstatestorage")
    String vmStateStorage;
    String watchdog;
    final Map<Integer, String> hostPci = new HashMap<>();
    final Map<Integer, String> ide = new HashMap<>();
    final Map<Integer, String> ipConfig = new HashMap<>();
    final Map<Integer, String> net = new HashMap<>();
    final Map<Integer, String> numas = new HashMap<>();
    final Map<Integer, String> parallel = new HashMap<>();
    final Map<Integer, String> sata = new HashMap<>();
    final Map<Integer, String> scsi = new HashMap<>();
    final Map<Integer, String> serial = new HashMap<>();
    final Map<Integer, String> unused = new HashMap<>();
    final Map<Integer, String> usb = new HashMap<>();
    final Map<Integer, String> virtio = new HashMap<>();

    public String[] getSshKeys() {
        String[] sshKeys = this.sshKeys.split(",");
        for(int i=0; i<sshKeys.length; i++)
            sshKeys[i] = UrlEncoder.decode(sshKeys[i]);
        return sshKeys;
    }

    public Boolean getAcpi() {
        return acpi == null ? null : (acpi > 0);
    }

    public boolean isAcpi() {
        return acpi != null && (acpi > 0);
    }

    public Boolean getAutostart() {
        return autostart == null ? null : (autostart > 0);
    }

    public boolean isAutostart() {
        return autostart != null && (autostart > 0);
    }

    public Boolean getFreeze() {
        return freeze == null ? null : (freeze > 0);
    }

    public boolean isFreeze() {
        return freeze != null && (freeze > 0);
    }

    public Boolean getKeepHugepages() {
        return keepHugepages == null ? null : (keepHugepages > 0);
    }

    public boolean shouldKeepHugepages() {
        return keepHugepages != null && (keepHugepages > 0);
    }

    public Boolean getKvm() {
        return kvm == null ? null : (kvm > 0);
    }

    public boolean isKvm() {
        return kvm != null && (kvm > 0);
    }

    public Boolean getLocalTime() {
        return localTime == null ? null : (localTime > 0);
    }

    public boolean isLocalTime() {
        return localTime != null && (localTime > 0);
    }

    public Boolean getNuma() {
        return numa == null ? null : (numa > 0);
    }

    public boolean isNuma() {
        return numa != null && (numa > 0);
    }

    public Boolean getProtection() {
        return protection == null ? null : (protection > 0);
    }

    public boolean isProtected() {
        return protection != null && (protection > 0);
    }

    public Boolean getAllowReboot() {
        return allowReboot == null ? null : (allowReboot > 0);
    }

    public boolean shouldAllowReboot() {
        return allowReboot != null && (allowReboot > 0);
    }

    public Boolean getTablet() {
        return tablet == null ? null : (tablet > 0);
    }

    public boolean isTablet() {
        return tablet != null && (tablet > 0);
    }

    public Boolean getTimeDriftFix() {
        return timeDriftFix == null ? null : (timeDriftFix > 0);
    }

    public boolean shouldFixTimeDrift() {
        return timeDriftFix != null && (timeDriftFix > 0);
    }

    public Boolean getEnableTemplate() {
        return enableTemplate == null ? null : (enableTemplate > 0);
    }

    public boolean isTemplateEnabled() {
        return enableTemplate != null && (enableTemplate > 0);
    }

    private static void parseMap(AbstractObject object, String key, Map<Integer, String> map) {
        object.keys().stream().filter(k -> k.startsWith(key) && Character.isDigit(k.charAt(k.length()-1))).forEach(k -> map.put(Integer.parseInt(k.substring(key.length())), object.string(k)));
    }

    public static QemuVMConfig from(AbstractObject object) {
        QemuVMConfig config = ProxMoxVEClient.MAPPER.fromAbstract(object, QemuVMConfig.class);
        parseMap(object, "hostpci", config.getHostPci());
        parseMap(object, "ide", config.getIde());
        parseMap(object, "ipconfig", config.getIpConfig());
        parseMap(object, "net", config.getNet());
        parseMap(object, "numa", config.getNumas());
        parseMap(object, "parallel", config.getParallel());
        parseMap(object, "sata", config.getSata());
        parseMap(object, "scsi", config.getScsi());
        parseMap(object, "serial", config.getSerial());
        parseMap(object, "unused", config.getUnused());
        parseMap(object, "usb", config.getUsb());
        parseMap(object, "virtio", config.getVirtio());
        return config;
    }

}
