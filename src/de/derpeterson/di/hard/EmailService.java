package de.derpeterson.di.hard;

public class EmailService {
	public void sendMessage(String message, String receiver) {
		// Send Email Logic
		System.out.println("Email sent to " + receiver + " with message=" + message);
	}
}
