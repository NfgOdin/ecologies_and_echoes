package net.ecologiesandechoes;

import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = EcologiesAndEchoes.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = EcologiesAndEchoes.MODID, value = Dist.CLIENT)
public class EcologiesAndEchoesClient {
    public EcologiesAndEchoesClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        EcologiesAndEchoes.LOGGER.info("Ecologies & Echoes client setup initializing...");
        EcologiesAndEchoes.LOGGER.info("MINECRAFT USER >> {}", Minecraft.getInstance().getUser().getName());
    }
}
