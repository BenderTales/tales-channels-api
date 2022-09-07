package fr.bendertales.mc.channels.api;

public class ChannelsAPI {

	private static Messenger messenger;

	private static Registry<PlaceholderHandler> PLACEHOLDERS_REGISTRY;
	private static Registry<ModChannelImplementationsProvider> CHANNELS_REGISTRY;

	/**
	 * Get the messenger you can use to send a message in a channel from your own mod.
	 * @return a registered messenger;
	 */
	public static Messenger getMessenger() {
		return messenger;
	}

	/**
	 * Register a channel implementation that will be accessible to players
	 * @param channelProvider
	 */
	public static void registerChannel(ModChannelImplementationsProvider channelProvider) {
		CHANNELS_REGISTRY.register(channelProvider);
	}

	/**
	 * Register a placeholder that will be parsed in channels
	 * @param placeholderHandler
	 */
	public static void registerPlaceholder(PlaceholderHandler placeholderHandler) {
		PLACEHOLDERS_REGISTRY.register(placeholderHandler);
	}

	public static void setMessenger(Messenger messenger) {
		if (ChannelsAPI.messenger != null) {
			throw new IllegalStateException("Channels API messenger cannot be set twice");
		}
	}

	public static void setPlaceholdersRegistry(Registry<PlaceholderHandler> registry) {
		if (ChannelsAPI.PLACEHOLDERS_REGISTRY != null) {
			throw new IllegalStateException("Channels API placeholders registry cannot be set twice");
		}
		PLACEHOLDERS_REGISTRY = registry;
	}

	public static void setChannelsRegistry(Registry<ModChannelImplementationsProvider> registry) {
		if (CHANNELS_REGISTRY != null) {
			throw new IllegalStateException("Channels API channels registry cannot be set twice");
		}
		CHANNELS_REGISTRY = registry;
	}
}
