package com.lumaserv.proxmox.ve.request.storage;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class StorageCreateRequest extends ProxMoxVERequest<StorageCreateRequest> {

    @MapperOptions(name = "storage")
    String name;
    String type;
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
    String content;
    String datastore;
    Integer disable;
    String domain;
    @MapperOptions(name = "encryption-key")
    String encryptionKey;
    String export;
    String fingerprint;
    String format;
    Integer fuse;
    String isMountpoint;
    @MapperOptions(name = "iscsiprovider")
    String iScsiProvider;
    Integer krbd;
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
    String nodes;
    @MapperOptions(name = "nowritecache")
    Integer noWriteCache;
    String options;
    String password;
    String path;
    String pool;
    Integer port;
    String portal;
    @MapperOptions(name = "prune-backups")
    String pruneBackups;
    @MapperOptions(name = "saferemove")
    Integer safeRemove;
    @MapperOptions(name = "saferemove_throughput")
    String safeRemoveThroughput;
    String server;
    String server2;
    String share;
    Integer shared;
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
    String username;
    @MapperOptions(name = "vgname")
    String vgName;
    String volume;

    public StorageCreateRequest setDisable(Boolean disable) {
        this.disable = disable == null ? null : (disable ? 1 : 0);
        return this;
    }

    public StorageCreateRequest setFuse(Boolean fuse) {
        this.fuse = fuse == null ? null : (fuse ? 1 : 0);
        return this;
    }

    public StorageCreateRequest setKrbd(Boolean krbd) {
        this.krbd = krbd == null ? null : (krbd ? 1 : 0);
        return this;
    }

    public StorageCreateRequest setMkdir(Boolean mkdir) {
        this.mkdir = mkdir == null ? null : (mkdir ? 1 : 0);
        return this;
    }

    public StorageCreateRequest setNocow(Boolean nocow) {
        this.nocow = nocow == null ? null : (nocow ? 1 : 0);
        return this;
    }

    public StorageCreateRequest setNoWriteCache(Boolean noWriteCache) {
        this.noWriteCache = noWriteCache == null ? null : (noWriteCache ? 1 : 0);
        return this;
    }

    public StorageCreateRequest setShared(Boolean shared) {
        this.shared = shared == null ? null : (shared ? 1 : 0);
        return this;
    }

    public StorageCreateRequest setSparse(Boolean sparse) {
        this.sparse = sparse == null ? null : (sparse ? 1 : 0);
        return this;
    }

}
