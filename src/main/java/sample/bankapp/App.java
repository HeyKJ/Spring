package sample.bankapp;

import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.bankapp.controller.FixedDepositController;

/**
 * Hello world!
 *
 */

public class App {
	private static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/spring/aplicationContext.xml");
		
		FixedDepositController controller = (FixedDepositController)ctx.getBean("controller");
		logger.info("정기예금 개설 여부 : " + controller.submit());
		logger.info(controller.get(1));
	}
}
