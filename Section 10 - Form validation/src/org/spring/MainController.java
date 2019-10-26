package org.spring;

import javax.validation.Valid;

import org.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping(value = "/")
	public ModelAndView home() {
		User user = new User();
		ModelAndView modelAndView = new ModelAndView("userFormView", "user", user);
		return modelAndView;
	}

	// ModelAttribute annotation is optional
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute("user") @Valid User user, BindingResult result) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		modelAndView.addObject("user", user);
		if (result.hasErrors()) {
			modelAndView = new ModelAndView("userFormView", "user", user);
			System.out.println("Has errors");
		}
		return modelAndView;

	}
}
