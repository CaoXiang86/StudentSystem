import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Controller.ManagerController;
import managerInterface.ManagerService;
import model.Manager;

import org.springframework.context.ApplicationContext;

public class ControllerTest {

	
	@Test
	public void controllerTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		ManagerService managerService = (ManagerService) context.getBean("managerService");
//		Manager manager = new Manager();
//		manager.setPassword("123");
//		manager.setUsername("cx");
//		Manager result = managerService.queryManagerByName(manager);
//		System.out.println(result.getPassword());
//		System.out.println(result.getUsername());
		ManagerController managerController = (ManagerController) context.getBean("managerController");
	}
}
