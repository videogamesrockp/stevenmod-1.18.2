package net.axd.stevenmod.event;

import net.axd.stevenmod.Main;
import net.axd.stevenmod.entity.ModEntityTypes;
import net.axd.stevenmod.entity.custom.AsianDadEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.ASIAN_DAD.get(), AsianDadEntity.setAttributes());
    }
}