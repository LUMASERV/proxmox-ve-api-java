package com.lumaserv.proxmox.ve.request.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class QemuVMCreateRequest extends ProxMoxVERequest<QemuVMCreateRequest> {

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
    Integer start;
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

    public QemuVMCreateRequest setHostPCI(int i, String value) {
        return set("hostpci" + i, value);
    }

    public QemuVMCreateRequest setIde(int i, String value) {
        return set("ide" + i, value);
    }

    public QemuVMCreateRequest setIpConfig(int i, String value) {
        return set("ipconfig" + i, value);
    }

    public QemuVMCreateRequest setNet(int i, String value) {
        return set("net" + i, value);
    }

    public QemuVMCreateRequest setNuma(int i, String value) {
        return set("numa" + i, value);
    }

    public QemuVMCreateRequest setParallel(int i, String value) {
        return set("parallel" + i, value);
    }

    public QemuVMCreateRequest setSata(int i, String value) {
        return set("sata" + i, value);
    }

    public QemuVMCreateRequest setScsi(int i, String value) {
        return set("scsi" + i, value);
    }

    public QemuVMCreateRequest setSerial(int i, String value) {
        return set("serial" + i, value);
    }

    public QemuVMCreateRequest setUnused(int i, String value) {
        return set("unused" + i, value);
    }

    public QemuVMCreateRequest setUsb(int i, String value) {
        return set("usb" + i, value);
    }

    public QemuVMCreateRequest setVirtio(int i, String value) {
        return set("virtio" + i, value);
    }

    public QemuVMCreateRequest setAcpi(Boolean acpi) {
        this.acpi = acpi == null ? null : (acpi ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setAutostart(Boolean autostart) {
        this.autostart = autostart == null ? null : (autostart ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setForce(Boolean force) {
        this.force = force == null ? null : (force ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setFreeze(Boolean freeze) {
        this.freeze = freeze == null ? null : (freeze ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setKeepHugepages(Boolean keepHugepages) {
        this.keepHugepages = keepHugepages == null ? null : (keepHugepages ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setKvm(Boolean kvm) {
        this.kvm = kvm == null ? null : (kvm ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setLiveRestore(Boolean liveRestore) {
        this.liveRestore = liveRestore == null ? null : (liveRestore ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setLocalTime(Boolean localTime) {
        this.localTime = localTime == null ? null : (localTime ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setNuma(Boolean numa) {
        this.numa = numa == null ? null : (numa ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setStartOnBoot(Boolean startOnBoot) {
        this.startOnBoot = startOnBoot == null ? null : (startOnBoot ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setProtection(Boolean protection) {
        this.protection = protection == null ? null : (protection ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setAllowReboot(Boolean allowReboot) {
        this.allowReboot = allowReboot == null ? null : (allowReboot ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setStart(Boolean start) {
        this.start = start == null ? null : (start ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setTablet(Boolean tablet) {
        this.tablet = tablet == null ? null : (tablet ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setTimeDriftFix(Boolean timeDriftFix) {
        this.timeDriftFix = timeDriftFix == null ? null : (timeDriftFix ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setEnableTemplate(Boolean enableTemplate) {
        this.enableTemplate = enableTemplate == null ? null : (enableTemplate ? 1 : 0);
        return this;
    }

    public QemuVMCreateRequest setUnique(Boolean unique) {
        this.unique = unique == null ? null : (unique ? 1 : 0);
        return this;
    }

}
