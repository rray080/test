package p;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//HelloWorld ob = (HelloWorld)context.getBean("hello");
		//System.out.println("Hello "+ob.getMessage()+ ob);
		
		//Example for inject object
		System.out.println("Inject object example");
		Triangle t = (Triangle)context.getBean("triangle");
		t.draw();
	}

}
