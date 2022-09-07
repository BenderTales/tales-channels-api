package fr.bendertales.mc.channels.api;


public interface PlaceholderHandler extends Identifiable {

	String getPlaceholder();
	boolean shouldApplyFormat(String format);

	/**
	 * If your placeholder doesn't need to know the recipient, implement it here
	 * @return
	 */
	PlaceholderFormatter getPlaceholderFormatter();

	/**
	 * If your placeholder needs to know the recipient, implement it here and return null in the other method
	 * @return
	 */
	default PerRecipientPlaceholderFormatter getPerRecipientPlaceholderFormatter() {
		return null;
	}

}
