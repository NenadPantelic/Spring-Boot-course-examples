package org.spring;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("appController")
public class AppController {

	private static final Logger logger = Logger.getLogger(AppController.class);

	@RequestMapping(value = "/")
	public ModelAndView homepage() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/user")
	public ModelAndView user() {
		logger.warn("User xyz visited /user");
		return new ModelAndView("user");
	}

	@RequestMapping(value = "/admin")
	public ModelAndView admin() {
		logger.info("User xyz visited /admin");
		return new ModelAndView("admin");
	}

}