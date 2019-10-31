package org.spring;

import java.util.ArrayList;
import java.util.List;

import org.spring.DAO.UserDAOImpl;
import org.spring.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@GetMapping(value = "/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<User> users = new ArrayList<User>();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/org/spring/DAO/SpringAppDAOConfig.xml");
		UserDAOImpl repository = context.getBean("DAOBean", UserDAOImpl.class);
		users = repository.getAllUsers();
		modelAndView.addObject("users", users);
		return modelAndView;
	}

}
