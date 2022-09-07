package fr.bendertales.mc.channels.api;

import net.minecraft.server.network.ServerPlayerEntity;


public record Message(
	ServerPlayerEntity sender,
	String content
) {
}
