package in.ashokeit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)throws Exception {
	ApplicationContext contex=new ClassPathXmlApplicationContext("spring.xml");
	BillCollector bc= contex.getBean("billcollector",BillCollector.class);
	bc.CollectPayment(14000.00);
	}

}
