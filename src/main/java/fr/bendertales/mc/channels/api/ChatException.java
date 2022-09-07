package fr.bendertales.mc.channels.api;

public class ChatException extends Exception {

	public ChatException(String message) {
		super(message);
	}

	public ChatException(String message, Throwable cause) {
		super(message, cause);
	}

}
