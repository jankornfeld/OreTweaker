package com.ewyboy.oretweaker.json.template.templates.collectives;

import com.ewyboy.oretweaker.json.objects.OreEntry;
import com.ewyboy.oretweaker.json.template.ITemplate;
import com.ewyboy.oretweaker.json.template.Templates;

import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

public class DefaultTemplate implements ITemplate {

    private final List<OreEntry> entries = new LinkedList<>();
    private static final List<String> INFESTED_AND_EMERALD_BIOMES = new LinkedList<>(); static {
        INFESTED_AND_EMERALD_BIOMES.add("minecraft:mountains");
        INFESTED_AND_EMERALD_BIOMES.add("minecraft:wooded_mountains");
        INFESTED_AND_EMERALD_BIOMES.add("minecraft:gravelly_mountains");
    }

    @Override
    public String templateName() {
        return "default";
    }

    @Override
    public Path templateDirectory() {
        return Templates.Directories.COLLECTIVES_PATH;
    }

    @Override
    public void buildTemplateEntries() {
        entries.add(new OreEntry(
                "minecraft:dirt",
                "minecraft:stone",
                1,
                256,
                32,
                10,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:gravel",
                "minecraft:stone",
                1,
                256,
                32,
                8,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:granite",
                "minecraft:stone",
                1,
                80,
                32,
                10,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:diorite",
                "minecraft:stone",
                1,
                80,
                32,
                10,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:andesite",
                "minecraft:stone",
                1,
                80,
                32,
                10,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:tuff",
                "minecraft:stone",
                1,
                16,
                32,
                1,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:deepslate",
                "minecraft:stone",
                1,
                16,
                64,
                2,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:infested_stone",
                "minecraft:stone",
                1,
                64,
                8,
                7,
                emptyList,
                INFESTED_AND_EMERALD_BIOMES
        ));
        entries.add(new OreEntry(
                "minecraft:coal_ore",
                "minecraft:stone",
                1,
                128,
                16,
                20,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:iron_ore",
                "minecraft:stone",
                1,
                64,
                8,
                20,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:copper_ore",
                "minecraft:stone",
                1,
                96,
                9,
                6,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:gold_ore",
                "minecraft:stone",
                1,
                32,
                8,
                2,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:redstone_ore",
                "minecraft:stone",
                1,
                16,
                7,
                8,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:lapis_ore",
                "minecraft:stone",
                1,
                30,
                6,
                3,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:diamond_ore",
                "minecraft:stone",
                1,
                16,
                7,
                1,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:emerald_ore",
                "minecraft:stone",
                4,
                32,
                1,
                5,
                emptyList,
                INFESTED_AND_EMERALD_BIOMES
        ));
        entries.add(new OreEntry(
                "minecraft:soul_sand",
                "minecraft:netherrack",
                1,
                32,
                12,
                12,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:gravel",
                "minecraft:netherrack",
                5,
                37,
                32,
                2,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:nether_quartz_ore",
                "minecraft:netherrack",
                10,
                246,
                14,
                10,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:nether_quartz_ore",
                "minecraft:netherrack",
                10,
                246,
                14,
                32,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:nether_gold_ore",
                "minecraft:netherrack",
                10,
                118,
                10,
                10,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:nether_gold_ore",
                "minecraft:netherrack",
                10,
                118,
                10,
                20,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:blackstone",
                "minecraft:netherrack",
                5,
                31,
                10,
                2,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:magma_block",
                "minecraft:netherrack",
                26,
                36,
                10,
                15,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:ancient_debris",
                "minecraft:netherrack",
                8,
                120,
                1,
                1,
                emptyList,
                emptyList
        ));
        entries.add(new OreEntry(
                "minecraft:ancient_debris",
                "minecraft:netherrack",
                8,
                24,
                2,
                1,
                emptyList,
                emptyList
        ));
    }

    @Override
    public List<OreEntry> getTemplate() {
        return entries;
    }
}