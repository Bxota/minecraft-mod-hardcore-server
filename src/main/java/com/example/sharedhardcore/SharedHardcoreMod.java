package com.example.sharedhardcore;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.GameMode;

public class SharedHardcoreMod implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerLivingEntityEvents.AFTER_DEATH.register((entity, damageSource) -> {
            if (!(entity instanceof ServerPlayerEntity dead)) return;

            MinecraftServer server = dead.getServer();
            if (server == null) return;

            String name = dead.getGameProfile().getName();
            server.getPlayerManager().broadcast(
                Text.literal("§c" + name + " est mort ! Tout le monde passe en Spectateur."),
                false
            );

            for (ServerPlayerEntity p : server.getPlayerManager().getPlayerList()) {
                p.changeGameMode(GameMode.SPECTATOR);
            }
        });
    }
}
