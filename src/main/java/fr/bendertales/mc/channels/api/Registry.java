package fr.bendertales.mc.channels.api;

public interface Registry<T extends Identifiable> extends Iterable<T> {

	void register(T object);
}
