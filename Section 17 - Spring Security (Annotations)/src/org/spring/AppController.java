package org.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("appController")
public class AppController {

	@RequestMapping(value = "/")
	public ModelAndView homepage() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/user")
	public ModelAndView user() {
		return new ModelAndView("user");
	}

	@RequestMapping(value = "/admin")
	public ModelAndView admin() {
		return new ModelAndView("admin");
	}

	@RequestMapping(value = "/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@RequestMapping("/403")
	public ModelAndView status403() {
		ModelAndView model = new ModelAndView("403");
		return model;
	}
}
