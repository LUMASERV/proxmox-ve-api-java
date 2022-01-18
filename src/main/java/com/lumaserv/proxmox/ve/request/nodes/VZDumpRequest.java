package com.lumaserv.proxmox.ve.request.nodes;

import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

@Setter
public class VZDumpRequest extends ProxMoxVERequest<VZDumpRequest> {

    Integer all;
    @MapperOptions(name = "bwlimit")
    Integer bandwidthLimit;
    String compress;
    @MapperOptions(name = "dumpdir")
    String dumpDirectory;
    String exclude;
    @MapperOptions(name = "exclude-path")
    String excludePath;
    @MapperOptions(name = "ionice")
    Integer ioNice;
    @MapperOptions(name = "lockwait")
    Integer lockWait;
    @MapperOptions(name = "mailnotification")
    String mailNotification;
    @MapperOptions(name = "mailto")
    String mailTo;
    @MapperOptions(name = "maxfiles")
    Integer maxFiles;
    String mode;
    String node;
    Integer pigz;
    String pool;
    @MapperOptions(name = "prune-backups")
    String pruneBackups;
    Integer quiet;
    Integer remove;
    String script;
    @MapperOptions(name = "stdexcludes")
    Integer stdExcludes;
    @MapperOptions(name = "stdout")
    Integer stdOut;
    Integer stop;
    @MapperOptions(name = "stopwait")
    Integer stopWait;
    String storage;
    @MapperOptions(name = "tmpdir")
    String tmpDirectory;
    @MapperOptions(name = "vmid")
    String vmId;
    Integer zstd;

    public VZDumpRequest setAll(Boolean all) {
        this.all = all == null ? null : (all ? 1 : 0);
        return this;
    }

    public VZDumpRequest setQuiet(Boolean quiet) {
        this.quiet = quiet == null ? null : (quiet ? 1 : 0);
        return this;
    }

    public VZDumpRequest setRemove(Boolean remove) {
        this.remove = remove == null ? null : (remove ? 1 : 0);
        return this;
    }

    public VZDumpRequest setStdExcludes(Boolean stdExcludes) {
        this.stdExcludes = stdExcludes == null ? null : (stdExcludes ? 1 : 0);
        return this;
    }

    public VZDumpRequest setStdOut(Boolean stdOut) {
        this.stdOut = stdOut == null ? null : (stdOut ? 1 : 0);
        return this;
    }

    public VZDumpRequest setStop(Boolean stop) {
        this.stop = stop == null ? null : (stop ? 1 : 0);
        return this;
    }

}
