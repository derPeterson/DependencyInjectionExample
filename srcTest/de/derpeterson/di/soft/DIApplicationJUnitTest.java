package de.derpeterson.di.soft;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DIApplicationJUnitTest {
	
	private MessageServiceInjector injector;
	
	@Before
	public void setUp(){
		//mock the injector with anonymous class
		injector = new EmailServiceInjector();
	}
	
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessage("Hi Pankaj", "pankaj@abc.com");
	}
	
	@After
	public void tear(){
		injector = null;
	}

}
