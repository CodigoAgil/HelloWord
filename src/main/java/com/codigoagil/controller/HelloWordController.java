package com.codigoagil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The Class HelloWordController.
 */
@Controller
public class HelloWordController {

	/**
	 * Home.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(final Model model) {

		return "index";
	}

}