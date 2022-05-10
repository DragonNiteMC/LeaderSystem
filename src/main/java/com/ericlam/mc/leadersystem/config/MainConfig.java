package com.ericlam.mc.leadersystem.config;

import com.dragonite.mc.dnmc.core.config.yaml.Configuration;
import com.dragonite.mc.dnmc.core.config.yaml.Resource;

@Resource(locate = "config.yml")
public class MainConfig extends Configuration {
    public int selectLimit;
    public int guiRow;
}
