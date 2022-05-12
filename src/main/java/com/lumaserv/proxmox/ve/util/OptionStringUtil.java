package com.lumaserv.proxmox.ve.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OptionStringUtil {

    public static Map<String, String> parseOptionString(String s, String... positionalOptions) {
        String[] spl = s.split(",");
        Map<String, String> options = new HashMap<>();
        for(int i=0; i<spl.length; i++) {
            if(i >= positionalOptions.length) {
                if(!spl[i].contains("="))
                    continue;
                options.put(spl[i].split("=", 2)[0], spl[i].split("=", 2)[1]);
            } else {
                options.put(positionalOptions[i], spl[i].startsWith(positionalOptions[i] + "=") ? spl[i].substring(positionalOptions[i].length() + 1) : spl[i]);
            }
        }
        return options;
    }

    public static String buildOptionString(Map<String, String> options, String... positionalOptions) {
        List<String> remaining = new ArrayList<>(options.keySet());
        List<String> parts = new ArrayList<>();
        for(String o : positionalOptions) {
            parts.add(options.get(o));
            remaining.remove(o);
        }
        for(String o : remaining)
            parts.add(o + "=" + options.get(o));
        return String.join(",", parts);
    }

}
