package org.spring;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.spring.DAO.UserDAOImpl;
import org.spring.config.AppConfig;
import org.spring.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping(value = "/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("index");
		//obvious error to check exception handling
		List<User> users = new ArrayList<User>("3");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserDAOImpl repository = context.getBean("DAOBean", UserDAOImpl.class);
		users = repository.getAllUsers();
		modelAndView.addObject("users", users);
		return modelAndView;
	}
	
	@RequestMapping(value="/addUser")
	public String addUser(Model model, @Valid User user, BindingResult result) {
		String viewName = null;
		if (result.hasErrors()) {
			model.addAttribute("user", user);
			viewName = "addUserView";
		} else if (user.getName() != null && user.getEmail() != null) {
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			UserDAOImpl repository = context.getBean("DAOBean", UserDAOImpl.class);
			repository.addUser(user);
			context.close();
			viewName = "forward:/";
			return viewName;
		} /*
			 * else { viewName = "addUser"; System.out.println("loading form"); }
			 */
		return viewName;

	}

}
