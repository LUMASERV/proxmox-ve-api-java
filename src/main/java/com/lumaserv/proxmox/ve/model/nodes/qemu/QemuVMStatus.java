package com.lumaserv.proxmox.ve.model.nodes.qemu;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.ProxMoxVEClient;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;

import java.util.HashMap;
import java.util.Map;

@Getter
public class QemuVMStatus {

    String template;
    Integer agent;
    @SerializedName("diskread")
    Long diskRead;
    Integer pid;
    @SerializedName("mem")
    Long memory;
    @SerializedName("running-qemu")
    String qemuVersion;
    Double cpus;
    String lock;
    @SerializedName("maxdisk")
    Long maxDisk;
    @SerializedName("maxmem")
    Long maxMemory;
    String name;
    @SerializedName("qmpstatus")
    String qmpStatus;
    Integer spice;
    String tags;
    Integer uptime;
    Long balloon;
    @SerializedName("running-machine")
    String machine;
    Double cpu;
    @SerializedName("netout")
    Long netOut;
    @SerializedName("freemem")
    Long freeMemory;
    Long disk;
    @SerializedName("diskwrite")
    Long diskWrite;
    @SerializedName("netin")
    Long netIn;
    String status;
    HA ha;
    @SerializedName("ballooninfo")
    BalloonInfo balloonInfo;
    @SerializedName("proxmox-support")
    ProxMoxSupport proxMoxSupport;
    transient final Map<String, NIC> nics = new HashMap<>();
    transient final Map<String, BlockStat> blockStats = new HashMap<>();

    public Boolean getAgent() {
        return agent == null ? null : (agent > 0);
    }

    public boolean isAgentEnabled() {
        return agent != null && (agent > 0);
    }

    public Boolean getSpice() {
        return spice == null ? null : (spice > 0);
    }

    public boolean isSpice() {
        return spice != null && (spice > 0);
    }

    @Getter
    public static class NIC {

        @SerializedName("netout")
        Long netOut;
        @SerializedName("netin")
        Long netIn;

    }

    public static class HA {

        Integer managed;

        public Boolean getManaged() {
            return managed == null ? null : (managed > 0);
        }

        public boolean isManaged() {
            return managed != null && (managed > 0);
        }

    }

    @Getter
    public static class BalloonInfo {

        @SerializedName("free_mem")
        Long freeMemory;
        Long actual;
        Long majorPageFaults;
        @SerializedName("mem_swapped_out")
        Long memorySwappedOut;
        @SerializedName("total_mem")
        Long totalMemory;
        Long lastUpdate;
        @SerializedName("mem_swapped_in")
        Long memorySwappedIn;
        Long minorPageFaults;
        @SerializedName("max_mem")
        Long maxMemory;

    }

    @Getter
    public static class BlockStat {

        Long flushTotalTimeNs;
        Long rdOperations;
        Long failedUnmapOperations;
        Long invalidUnmapOperations;
        Long wrHighestOffset;
        Long unmapTotalTimeNs;
        Long wrTotalTimeNs;
        Long unmapOperations;
        Boolean accountFailed;
        Long wrMerged;
        Long rdTotalTimeNs;
        Long ideTimeNs;
        Long invalidRdOperations;
        Long failedRdOperations;
        Long invalidFlushOperations;
        Long failedFlushOperations;
        Long unmapMerged;
        Long wrBytes;
        Long rdBytes;
        Long invalidWrOperations;
        Long wrOperations;
        Long unmapBytes;
        Boolean accountInvalid;
        Long failedWrOperations;
        Long flushOperations;
        Long rdMerged;

    }

    @Getter
    public static class ProxMoxSupport {

        @SerializedName("pbs-dirty-bitmap-migration")
        Boolean pbsDirtyBitmapMigration;
        @SerializedName("query-bitmap-info")
        Boolean queryBitmapInfo;
        @SerializedName("pbs-masterkey")
        Boolean pbsMasterkey;
        @SerializedName("pbs-dirty-bitmap")
        Boolean pbsDirtyBitmap;
        @SerializedName("pbs-dirty-bitmap-savevm")
        Boolean pbsDirtyBitmapSavevm;
        @SerializedName("pbs-library-version")
        String pbsLibraryVersion;

    }

    public static QemuVMStatus from(AbstractObject object) {
        QemuVMStatus status = ProxMoxVEClient.MAPPER.fromAbstract(object, QemuVMStatus.class);
        if(object.has("nics") && object.get("nics").isObject())
            object.object("nics").forEach((k, e) -> status.getNics().put(k, ProxMoxVEClient.MAPPER.fromAbstract(e, NIC.class)));
        if(object.has("blockstat") && object.get("blockstat").isObject())
            object.object("blockstat").forEach((k, e) -> status.getBlockStats().put(k, ProxMoxVEClient.MAPPER.fromAbstract(e, BlockStat.class)));
        return status;
    }

}
