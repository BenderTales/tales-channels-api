package fr.bendertales.mc.channels.api;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;


public interface Messenger {

	void sendMessage(ServerPlayerEntity sender, String message, Identifier channelId) throws ChatException;
}
