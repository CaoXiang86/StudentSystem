import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Controller.ManagerController;
import managerInterface.ManagerService;
import model.Manager;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ManagerController managerController = (ManagerController) context.getBean("managerController");
		System.out.println(managerController==null);
		
	}
}
