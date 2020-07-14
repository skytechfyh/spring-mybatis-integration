package net.xdclass;

import net.xdclass.model.User;
import net.xdclass.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author fyh
 * @date 2020/7/14
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config\\spring-config.xml");
		UserService userService = (UserService)context.getBean("userService");
		List<User> userList = userService.listUser();
		userList.forEach(System.out::println);
	}
}
