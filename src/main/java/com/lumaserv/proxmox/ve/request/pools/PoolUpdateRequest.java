package com.lumaserv.proxmox.ve.request.pools;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

import java.util.List;

@Setter
public class PoolUpdateRequest extends ProxMoxVERequest<PoolUpdateRequest> {

    String comment;
    Integer delete;
    @SerializedName("storage")
    String storages;
    @SerializedName("vms")
    String VMs;

    public PoolUpdateRequest setDelete(Boolean delete) {
        this.delete = delete == null ? null : (delete ? 1 : 0);
        return this;
    }

    public PoolUpdateRequest setStorages(List<String> storages) {
        this.storages = String.join(",", storages);
        return this;
    }

    public PoolUpdateRequest setStorages(String... storages) {
        this.storages = String.join(",", storages);
        return this;
    }

    public PoolUpdateRequest setVMs(List<String> vms) {
        this.VMs = String.join(",", vms);
        return this;
    }

    public PoolUpdateRequest setVMs(String... vms) {
        this.VMs = String.join(",", vms);
        return this;
    }

}
