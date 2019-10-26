package org.spring;

import java.util.HashMap;
import java.util.Map;

import org.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping(value = "/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		Map<String, String> genders = new HashMap<String, String>();
		genders.put("male", "Male");
		genders.put("female", "Female");
		modelAndView.addObject("user", user);
		modelAndView.addObject("genderMap", genders);
		return modelAndView;
	}

	// ModelAttribute annotation is optional
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}
