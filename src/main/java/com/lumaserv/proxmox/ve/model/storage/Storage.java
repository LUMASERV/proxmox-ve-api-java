package com.lumaserv.proxmox.ve.model.storage;

import lombok.Getter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Getter
public class Storage {

    @MapperOptions(name = "storage")
    String name;
    Integer shared;
    String digest;
    String pool;
    Integer krbd;
    String type;
    String server;
    @MapperOptions(name = "encryption-key")
    String encryptionKey;
    String datastore;
    String fingerprint;
    @MapperOptions(name = "prune-backups")
    String pruneBackups;
    String username;
    String content;
    String path;
    String nodes;
    Integer disable;
    String share;
    @MapperOptions(name = "authsupported")
    String authSupported;
    String base;
    @MapperOptions(name = "blocksize")
    String blockSize;
    @MapperOptions(name = "bwlimit")
    String bandwidthLimit;
    @MapperOptions(name = "comstar_hg")
    String comstarHostGroup;
    @MapperOptions(name = "comstar_tg")
    String comstarTargetGroup;
    String domain;
    String export;
    String format;
    Integer fuse;
    String isMountpoint;
    @MapperOptions(name = "iscsiprovider")
    String iScsiProvider;
    @MapperOptions(name = "lio_tpg")
    String lioTargetPortalGroup;
    @MapperOptions(name = "master-pubkey")
    String masterPublicKey;
    @MapperOptions(name = "maxfiles")
    Integer maxFiles;
    Integer mkdir;
    @MapperOptions(name = "monhost")
    String monitorHost;
    String mountpoint;
    String namespace;
    Integer nocow;
    @MapperOptions(name = "nowritecache")
    Integer noWriteCache;
    String options;
    String password;
    Integer port;
    String portal;
    @MapperOptions(name = "saferemove")
    Integer safeRemove;
    @MapperOptions(name = "saferemove_throughput")
    String safeRemoveThroughput;
    String server2;
    @MapperOptions(name = "smbversion")
    String smbVersion;
    Integer sparse;
    @MapperOptions(name = "subdir")
    String subDirectory;
    Integer taggedOnly;
    String target;
    @MapperOptions(name = "thinpool")
    String thinPool;
    String transport;
    @MapperOptions(name = "vgname")
    String vgName;
    String volume;
    @MapperOptions(name = "avail")
    Long available;
    @MapperOptions(name = "total")
    Long total;
    Long used;
    Double usedFraction;
    Integer active;

    public Boolean getActive() {
        return active == null ? null : (active > 0);
    }

    public boolean isActive() {
        return active != null && (active > 0);
    }

    public Boolean getDisable() {
        return disable == null ? null : (disable > 0);
    }

    public boolean isDisabled() {
        return disable != null && (disable > 0);
    }

    public Boolean getShared() {
        return shared == null ? null : (shared > 0);
    }

    public boolean isShared() {
        return shared != null && (shared > 0);
    }

    public Boolean getKrbd() {
        return krbd == null ? null : (krbd > 0);
    }

    public boolean isKrdb() {
        return krbd != null && (krbd > 0);
    }

    public Boolean getFuse() {
        return fuse == null ? null : (fuse > 0);
    }

    public boolean isFuse() {
        return fuse != null && (fuse > 0);
    }

    public Boolean getMkdir() {
        return mkdir == null ? null : (mkdir > 0);
    }

    public boolean isMkdir() {
        return mkdir != null && (mkdir > 0);
    }

    public Boolean getNocow() {
        return nocow == null ? null : (nocow > 0);
    }

    public boolean isNocow() {
        return nocow != null && (nocow > 0);
    }

    public Boolean getNoWriteCache() {
        return noWriteCache == null ? null : (noWriteCache > 0);
    }

    public boolean isNoWriteCache() {
        return noWriteCache != null && (noWriteCache > 0);
    }

    public Boolean getSafeRemove() {
        return safeRemove == null ? null : (safeRemove > 0);
    }

    public boolean isSafeRemove() {
        return safeRemove != null && (safeRemove > 0);
    }

    public Boolean getSparse() {
        return sparse == null ? null : (sparse > 0);
    }

    public boolean isSparse() {
        return sparse != null && (sparse > 0);
    }

}
