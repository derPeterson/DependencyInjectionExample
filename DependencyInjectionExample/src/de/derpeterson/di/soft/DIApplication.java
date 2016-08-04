package de.derpeterson.di.soft;

public class DIApplication implements Consumer {
	
	private MessageService messageService;
	
	public DIApplication() {}
	
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	@Override
	public void processMessage(String message, String receiver) {
		this.messageService.sendMessage(message, receiver);
	}
	
	
}
