package com.ericlam.mc.leadersystem.config;

import com.dragonite.mc.dnmc.core.config.yaml.Configuration;
import com.dragonite.mc.dnmc.core.config.yaml.Resource;

import java.util.List;
import java.util.Map;

@Resource(locate = "leaders.yml")
public class LeadersConfig extends Configuration {
    public Map<String, LeaderBoard> stats;

    public static class LeaderBoard {
        public String table;
        public String column;
        public String playerName;
        public String playerUuid;
        public String dataShow;
        public List<String> sign;
        public String invTitle;
        public String invName;
        public List<String> invLores;
    }

}
