package com.ericlam.mc.leadersystem.config;

import com.dragonnite.mc.dnmc.core.config.yaml.Configuration;
import com.dragonnite.mc.dnmc.core.config.yaml.Resource;

@Resource(locate = "config.yml")
public class MainConfig extends Configuration {
    public int selectLimit;
    public int guiRow;
}
