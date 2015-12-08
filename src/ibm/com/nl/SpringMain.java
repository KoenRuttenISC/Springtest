package ibm.com.nl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
		System.out.println(obj.getMessage());
		System.out.println("test");
		

		



	}

}
