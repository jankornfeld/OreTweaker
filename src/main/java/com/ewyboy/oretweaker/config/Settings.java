package com.ewyboy.oretweaker.config;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

public class Settings {

    public static final ForgeConfigSpec settingSpec;
    public static final ServerConfig SETTINGS;

    static {
        Pair<ServerConfig, ForgeConfigSpec> specPair = (new ForgeConfigSpec.Builder()).configure(ServerConfig :: new);
        settingSpec = specPair.getRight();
        SETTINGS = specPair.getLeft();
    }

    public static class ServerConfig {

        public final ForgeConfigSpec.ConfigValue<Boolean> debugMode;
        public final ForgeConfigSpec.ConfigValue<Boolean> regenerateTemplates;
        public final ForgeConfigSpec.ConfigValue<Boolean> regenerateDefaultSettings;

        public static void setFalse(ForgeConfigSpec.ConfigValue<Boolean> booleanConfigValue) {
            if (booleanConfigValue.get()) booleanConfigValue.set(Boolean.FALSE);
        }

        ServerConfig(ForgeConfigSpec.Builder builder) {
            builder.comment("Ore Tweaker - Settings File");
                builder.push("SETTINGS");
                    this.debugMode = builder
                            .comment("Enables debug mode")
                            .translation("oretweaker.settings.debug")
                            .define("debug", false);
                builder.pop();
                builder.push("TEMPLATES");
                    this.regenerateTemplates = builder
                            .comment("Attempts to regenerate template files if not present")
                            .translation("oretweaker.templates.generate_templates")
                            .define("generate_templates", true);
                builder.pop();
                builder.push("DATA");
                    this.regenerateDefaultSettings = builder
                            .comment("Attempts to regenerate default data files if not present")
                            .translation("oretweaker.templates.generate_default_settings")
                            .define("generate_default_settings", true);
                builder.pop();
            builder.build();
        }
    }

    public static void setup() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Settings.settingSpec, "oretweaker/OreTweaker.toml");
    }

}
