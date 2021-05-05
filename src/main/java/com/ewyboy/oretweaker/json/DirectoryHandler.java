package com.ewyboy.oretweaker.json;

import com.ewyboy.oretweaker.OreTweaker;
import com.ewyboy.oretweaker.util.ModLogger;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryHandler {

    private static final Path ORE_TWEAKER_PATH = Paths.get(FMLPaths.CONFIGDIR.get().toAbsolutePath().toString(), OreTweaker.MOD_ID);
    private static final Path TEMPLATE_PATH = Paths.get(FMLPaths.CONFIGDIR.get().toAbsolutePath() + "/" + OreTweaker.MOD_ID, "templates");

    public static void setup() {
        createDirectories(ORE_TWEAKER_PATH);
        createDirectories(TEMPLATE_PATH);
    }

    public static void createDirectories(Path directoryPath) {
        try {
            ModLogger.info("Creating Ore Tweaker directory :: " + directoryPath);
            Files.createDirectory(directoryPath);
        } catch (FileAlreadyExistsException ignored) {
        } catch (IOException e) {
            ModLogger.error("Failed to create Ore Tweaker directory :: " + directoryPath, e);
        }
    }

}
