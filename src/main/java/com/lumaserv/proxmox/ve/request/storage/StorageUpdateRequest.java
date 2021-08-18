package com.lumaserv.proxmox.ve.request.storage;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class StorageUpdateRequest extends ProxMoxVERequest<StorageUpdateRequest> {

    String digest;
    String delete;
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
    String content;
    String datastore;
    Integer disable;
    String domain;
    @SerializedName("encryption-key")
    String encryptionKey;
    String export;
    String fingerprint;
    String format;
    Integer fuse;
    String isMountpoint;
    @SerializedName("iscsiprovider")
    String iScsiProvider;
    Integer krbd;
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
    String nodes;
    @SerializedName("nowritecache")
    Integer noWriteCache;
    String options;
    String password;
    String path;
    String pool;
    Integer port;
    String portal;
    @SerializedName("prune-backups")
    String pruneBackups;
    @SerializedName("saferemove")
    Integer safeRemove;
    @SerializedName("saferemove_throughput")
    String safeRemoveThroughput;
    String server;
    String server2;
    String share;
    Integer shared;
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
    String username;
    @SerializedName("vgname")
    String vgName;
    String volume;

    public StorageUpdateRequest setDisable(Boolean disable) {
        this.disable = disable == null ? null : (disable ? 1 : 0);
        return this;
    }

    public StorageUpdateRequest setFuse(Boolean fuse) {
        this.fuse = fuse == null ? null : (fuse ? 1 : 0);
        return this;
    }

    public StorageUpdateRequest setKrbd(Boolean krbd) {
        this.krbd = krbd == null ? null : (krbd ? 1 : 0);
        return this;
    }

    public StorageUpdateRequest setMkdir(Boolean mkdir) {
        this.mkdir = mkdir == null ? null : (mkdir ? 1 : 0);
        return this;
    }

    public StorageUpdateRequest setNocow(Boolean nocow) {
        this.nocow = nocow == null ? null : (nocow ? 1 : 0);
        return this;
    }

    public StorageUpdateRequest setNoWriteCache(Boolean noWriteCache) {
        this.noWriteCache = noWriteCache == null ? null : (noWriteCache ? 1 : 0);
        return this;
    }

    public StorageUpdateRequest setShared(Boolean shared) {
        this.shared = shared == null ? null : (shared ? 1 : 0);
        return this;
    }

    public StorageUpdateRequest setSparse(Boolean sparse) {
        this.sparse = sparse == null ? null : (sparse ? 1 : 0);
        return this;
    }

}
