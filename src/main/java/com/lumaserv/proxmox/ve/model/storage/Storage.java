package com.lumaserv.proxmox.ve.model.storage;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Storage {

    @SerializedName("storage")
    String name;
    Integer shared;
    String digest;
    String pool;
    Integer krbd;
    String type;
    String server;
    @SerializedName("encryption-key")
    String encryptionKey;
    String datastore;
    String fingerprint;
    @SerializedName("prune-backups")
    String pruneBackups;
    String username;
    String content;
    String path;
    String nodes;
    Integer disable;
    String share;
    @SerializedName("authsupported")
    String authSupported;
    String base;
    @SerializedName("blocksize")
    String blockSize;
    @SerializedName("bwlimit")
    String bandwidthLimit;
    @SerializedName("comstar_hg")
    String comstarHostGroup;
    @SerializedName("comstar_tg")
    String comstarTargetGroup;
    String domain;
    String export;
    String format;
    Integer fuse;
    String isMountpoint;
    @SerializedName("iscsiprovider")
    String iScsiProvider;
    @SerializedName("lio_tpg")
    String lioTargetPortalGroup;
    @SerializedName("master-pubkey")
    String masterPublicKey;
    @SerializedName("maxfiles")
    Integer maxFiles;
    Integer mkdir;
    @SerializedName("monhost")
    String monitorHost;
    String mountpoint;
    String namespace;
    Integer nocow;
    @SerializedName("nowritecache")
    Integer noWriteCache;
    String options;
    String password;
    Integer port;
    String portal;
    @SerializedName("saferemove")
    Integer safeRemove;
    @SerializedName("saferemove_throughput")
    String safeRemoveThroughput;
    String server2;
    @SerializedName("smbversion")
    String smbVersion;
    Integer sparse;
    @SerializedName("subdir")
    String subDirectory;
    Integer taggedOnly;
    String target;
    @SerializedName("thinpool")
    String thinPool;
    String transport;
    @SerializedName("vgname")
    String vgName;
    String volume;
    @SerializedName("avail")
    Long available;
    @SerializedName("total")
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
