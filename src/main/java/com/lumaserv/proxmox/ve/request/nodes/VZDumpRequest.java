package com.lumaserv.proxmox.ve.request.nodes;

import com.google.gson.annotations.SerializedName;
import com.lumaserv.proxmox.ve.request.ProxMoxVERequest;
import lombok.Setter;

@Setter
public class VZDumpRequest extends ProxMoxVERequest<VZDumpRequest> {

    Integer all;
    @SerializedName("bwlimit")
    Integer bandwidthLimit;
    String compress;
    @SerializedName("dumpdir")
    String dumpDirectory;
    String exclude;
    @SerializedName("exclude-path")
    String excludePath;
    @SerializedName("ionice")
    Integer ioNice;
    @SerializedName("lockwait")
    Integer lockWait;
    @SerializedName("mailnotification")
    String mailNotification;
    @SerializedName("mailto")
    String mailTo;
    @SerializedName("maxfiles")
    Integer maxFiles;
    String mode;
    String node;
    Integer pigz;
    String pool;
    @SerializedName("prune-backups")
    String pruneBackups;
    Integer quiet;
    Integer remove;
    String script;
    @SerializedName("stdexcludes")
    Integer stdExcludes;
    @SerializedName("stdout")
    Integer stdOut;
    Integer stop;
    @SerializedName("stopwait")
    Integer stopWait;
    String storage;
    @SerializedName("tmpdir")
    String tmpDirectory;
    @SerializedName("vmid")
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
