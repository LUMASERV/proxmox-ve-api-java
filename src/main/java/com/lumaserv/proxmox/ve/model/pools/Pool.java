package com.lumaserv.proxmox.ve.model.pools;

import lombok.Getter;
import lombok.Setter;
import org.javawebstack.abstractdata.mapper.annotation.MapperOptions;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public class Pool {

    @MapperOptions(name = "poolid")
    String id;
    String comment;
    Member[] members;

    public List<Member> getMembers() {
        return Arrays.asList(members);
    }

    @Getter
    @Setter
    public static class Member {

        String type;
        String node;
        @MapperOptions(name = "vmid")
        Integer vmId;
        String name;

    }

}
