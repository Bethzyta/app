package sv.edu.ufg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "home";

	}

	@RequestMapping(value = "/app", method = RequestMethod.GET)
	public String hello(ModelMap model) {

		return "home";
	}

}