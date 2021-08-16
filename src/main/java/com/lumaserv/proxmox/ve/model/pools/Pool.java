package com.lumaserv.proxmox.ve.model.pools;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
public class Pool {

    @SerializedName("poolid")
    String id;
    String comment;
    Member[] members;

    public List<Member> getMembers() {
        return Arrays.asList(members);
    }

    @Getter
    public static class Member {

        String type;
        String node;
        @SerializedName("vmid")
        Integer vmId;
        String name;

    }

}
