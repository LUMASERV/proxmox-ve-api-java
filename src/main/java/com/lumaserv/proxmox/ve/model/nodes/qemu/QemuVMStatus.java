package com.lumaserv.proxmox.ve.model.nodes.qemu;

import com.lumaserv.proxmox.ve.ProxMoxVEClient;
import lombok.Getter;
import org.javawebstack.abstractdata.AbstractObject;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.HashMap;
import java.util.Map;

@Getter
public class QemuVMStatus {

    String template;
    Integer agent;
    @MapperOptions(name = "diskread")
    Long diskRead;
    Integer pid;
    @MapperOptions(name = "mem")
    Long memory;
    @MapperOptions(name = "running-qemu")
    String qemuVersion;
    Double cpus;
    String lock;
    @MapperOptions(name = "maxdisk")
    Long maxDisk;
    @MapperOptions(name = "maxmem")
    Long maxMemory;
    String name;
    @MapperOptions(name = "qmpstatus")
    String qmpStatus;
    Integer spice;
    String tags;
    Integer uptime;
    Long balloon;
    @MapperOptions(name = "running-machine")
    String machine;
    Double cpu;
    @MapperOptions(name = "netout")
    Long netOut;
    @MapperOptions(name = "freemem")
    Long freeMemory;
    Long disk;
    @MapperOptions(name = "diskwrite")
    Long diskWrite;
    @MapperOptions(name = "netin")
    Long netIn;
    String status;
    HA ha;
    @MapperOptions(name = "ballooninfo")
    BalloonInfo balloonInfo;
    @MapperOptions(name = "proxmox-support")
    ProxMoxSupport proxMoxSupport;
    @MapperOptions(generic = { String.class, NIC.class })
    Map<String, NIC> nics = new HashMap<>();
    @MapperOptions(name = "blockstat", generic = { String.class, BlockStat.class })
    Map<String, BlockStat> blockStats = new HashMap<>();

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

        @MapperOptions(name = "netout")
        Long netOut;
        @MapperOptions(name = "netin")
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

        @MapperOptions(name = "free_mem")
        Long freeMemory;
        Long actual;
        Long majorPageFaults;
        @MapperOptions(name = "mem_swapped_out")
        Long memorySwappedOut;
        @MapperOptions(name = "total_mem")
        Long totalMemory;
        Long lastUpdate;
        @MapperOptions(name = "mem_swapped_in")
        Long memorySwappedIn;
        Long minorPageFaults;
        @MapperOptions(name = "max_mem")
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

        @MapperOptions(name = "pbs-dirty-bitmap-migration")
        Boolean pbsDirtyBitmapMigration;
        @MapperOptions(name = "query-bitmap-info")
        Boolean queryBitmapInfo;
        @MapperOptions(name = "pbs-masterkey")
        Boolean pbsMasterkey;
        @MapperOptions(name = "pbs-dirty-bitmap")
        Boolean pbsDirtyBitmap;
        @MapperOptions(name = "pbs-dirty-bitmap-savevm")
        Boolean pbsDirtyBitmapSavevm;
        @MapperOptions(name = "pbs-library-version")
        String pbsLibraryVersion;

    }

}
