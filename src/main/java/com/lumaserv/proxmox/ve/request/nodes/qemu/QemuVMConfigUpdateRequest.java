package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMConfigUpdateRequest extends ProxMoxVERequest<QemuVMConfigUpdateRequest> {

    Integer acpi;
    String agent;
    String arch;
    String archive;
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
    @SerializedName("bwlimit")
    Integer bandwidthLimit;
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
    Integer force;
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
    @SerializedName("live-restore")
    Integer liveRestore;
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
    Integer startOnBoot;
    @SerializedName("ostype")
    String osType;
    String pool;
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
    String storage;
    Integer tablet;
    String tags;
    Integer timeDriftFix;
    Integer enableTemplate;
    Integer unique;
    Integer vcpus;
    String vga;
    @SerializedName("vmgenid")
    String vmGenId;
    @SerializedName("vmstatestorage")
    String vmStateStorage;
    String watchdog;
    String revert;
    String delete;
    String digest;
    @SerializedName("skiplock")
    Integer skipLock;
    Integer backgroundDelay;

    public QemuVMConfigUpdateRequest setHostPCI(int i, String value) {
        return set("hostpci" + i, value);
    }

    public QemuVMConfigUpdateRequest setIde(int i, String value) {
        return set("ide" + i, value);
    }

    public QemuVMConfigUpdateRequest setIpConfig(int i, String value) {
        return set("ipconfig" + i, value);
    }

    public QemuVMConfigUpdateRequest setNet(int i, String value) {
        return set("net" + i, value);
    }

    public QemuVMConfigUpdateRequest setNuma(int i, String value) {
        return set("numa" + i, value);
    }

    public QemuVMConfigUpdateRequest setParallel(int i, String value) {
        return set("parallel" + i, value);
    }

    public QemuVMConfigUpdateRequest setSata(int i, String value) {
        return set("sata" + i, value);
    }

    public QemuVMConfigUpdateRequest setScsi(int i, String value) {
        return set("scsi" + i, value);
    }

    public QemuVMConfigUpdateRequest setSerial(int i, String value) {
        return set("serial" + i, value);
    }

    public QemuVMConfigUpdateRequest setUnused(int i, String value) {
        return set("unused" + i, value);
    }

    public QemuVMConfigUpdateRequest setUsb(int i, String value) {
        return set("usb" + i, value);
    }

    public QemuVMConfigUpdateRequest setVirtio(int i, String value) {
        return set("virtio" + i, value);
    }

    public QemuVMConfigUpdateRequest setAcpi(Boolean acpi) {
        this.acpi = acpi == null ? null : (acpi ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setAutostart(Boolean autostart) {
        this.autostart = autostart == null ? null : (autostart ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setForce(Boolean force) {
        this.force = force == null ? null : (force ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setFreeze(Boolean freeze) {
        this.freeze = freeze == null ? null : (freeze ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setKeepHugepages(Boolean keepHugepages) {
        this.keepHugepages = keepHugepages == null ? null : (keepHugepages ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setKvm(Boolean kvm) {
        this.kvm = kvm == null ? null : (kvm ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setLiveRestore(Boolean liveRestore) {
        this.liveRestore = liveRestore == null ? null : (liveRestore ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setLocalTime(Boolean localTime) {
        this.localTime = localTime == null ? null : (localTime ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setNuma(Boolean numa) {
        this.numa = numa == null ? null : (numa ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setStartOnBoot(Boolean startOnBoot) {
        this.startOnBoot = startOnBoot == null ? null : (startOnBoot ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setProtection(Boolean protection) {
        this.protection = protection == null ? null : (protection ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setAllowReboot(Boolean allowReboot) {
        this.allowReboot = allowReboot == null ? null : (allowReboot ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setSkipLock(Boolean skipLock) {
        this.skipLock = skipLock == null ? null : (skipLock ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setTablet(Boolean tablet) {
        this.tablet = tablet == null ? null : (tablet ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setTimeDriftFix(Boolean timeDriftFix) {
        this.timeDriftFix = timeDriftFix == null ? null : (timeDriftFix ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setEnableTemplate(Boolean enableTemplate) {
        this.enableTemplate = enableTemplate == null ? null : (enableTemplate ? 1 : 0);
        return this;
    }

    public QemuVMConfigUpdateRequest setUnique(Boolean unique) {
        this.unique = unique == null ? null : (unique ? 1 : 0);
        return this;
    }

}
