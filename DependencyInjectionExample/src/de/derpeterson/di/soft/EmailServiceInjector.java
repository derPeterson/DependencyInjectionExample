package de.derpeterson.di.soft;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		DIApplication app = new DIApplication();
		app.setMessageService(new EmailServiceImpl());
		return app;
	}
	
}
