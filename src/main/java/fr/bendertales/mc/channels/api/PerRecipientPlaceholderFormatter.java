package fr.bendertales.mc.channels.api;

import net.minecraft.server.network.ServerPlayerEntity;

@FunctionalInterface
public interface PerRecipientPlaceholderFormatter {

	/**
	 * Format the character string that will replace
	 * @param message
	 * @param recipient A player or null if console
	 * @return
	 */
	String format(Message message, ServerPlayerEntity recipient);

}
