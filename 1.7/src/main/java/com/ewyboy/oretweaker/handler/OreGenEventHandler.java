package com.ewyboy.oretweaker.handler;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import static com.ewyboy.oretweaker.loaders.ConfigLoader.*;

public class OreGenEventHandler {

    @SubscribeEvent
    public void onOreGenMinable(OreGenEvent.GenerateMinable event) {
        switch (event.type) {
            case COAL:
                if (disableOres[0]) event.setResult(Event.Result.DENY);
                break;
            case IRON:
                if (disableOres[1]) event.setResult(Event.Result.DENY);
                break;
            case GOLD:
                if (disableOres[2]) event.setResult(Event.Result.DENY);
                break;
            case DIAMOND:
                if (disableOres[3]) event.setResult(Event.Result.DENY);
                break;
            case REDSTONE:
                if (disableOres[4]) event.setResult(Event.Result.DENY);
                break;
            case LAPIS:
                if (disableOres[5]) event.setResult(Event.Result.DENY);
                break;
            case DIRT:
                if (disableOres[6]) event.setResult(Event.Result.DENY);
                break;
            case GRAVEL:
                if (disableOres[7]) event.setResult(Event.Result.DENY);
                break;
            default:
        }
    }
}
