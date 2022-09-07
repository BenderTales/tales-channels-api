package fr.bendertales.mc.channels.api;

public enum MessageVisibility {
	SHOW(true),
	HIDE(false),
	SOCIAL_SPY(true);

	private final boolean visible;

	MessageVisibility(boolean visible) {
		this.visible = visible;
	}

	public boolean isVisible() {
		return visible;
	}
}
