package org.spring;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	
	/* Variant #1 
	 * @RequestMapping("displayname") public String displayName(HttpServletRequest
	 * request) { String firstName = request.getParameter("firstName");
	 * request.setAttribute("firstName", firstName); return "displayName"; }
	 */
	
	
	/* Variant #2
	 * @RequestMapping("displayname") public String
	 * displayName(@RequestParam("firstName") String firstName, Model model) {
	 * model.addAttribute("firstName", firstName); return "displayName"; }
	 */
	
	@GetMapping("displayname")
	public ModelAndView displayName(@RequestParam("firstName") String firstName) {
		
		ModelAndView modelAndView = new ModelAndView("displayName");
		modelAndView.addObject("firstName", firstName);
		modelAndView.addObject("date", new Date());
		List<String> team = new ArrayList<>();
		team.add("Nenad");
		team.add("John");
		team.add("Jane");
		team.add("Nikola");
		modelAndView.addObject("team", team);
		return modelAndView;
	}
}

