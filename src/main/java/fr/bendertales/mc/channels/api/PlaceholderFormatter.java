package fr.bendertales.mc.channels.api;


@FunctionalInterface
public interface PlaceholderFormatter {

	String format(Message message);
}
