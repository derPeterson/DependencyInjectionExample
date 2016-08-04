package de.derpeterson.di.soft;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		DIApplication app = new DIApplication();
		app.setMessageService(new SMSServiceImpl());
		return app;
	}
	
}