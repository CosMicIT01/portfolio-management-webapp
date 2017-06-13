package com.mitu.crm.controller;

import com.mitu.crm.model.User;
import com.mitu.crm.service.RegistrationModelValidator;
import com.mitu.crm.service.SignInModelValidator;
import com.mitu.crm.service.UserDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;
import java.util.Map;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserDetailService userDetailService;

	@Autowired
	RegistrationModelValidator  registrationModelValidator;

	@Autowired
	SignInModelValidator signInModelValidator;

	@RequestMapping(value="/registration", method= RequestMethod.GET)
	public String registration(Model model, HttpServletRequest request) {

		model.addAttribute("userForm", new User());
		return "registration";
	}


	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registration(@ModelAttribute("userForm") User user, BindingResult bindingResult, Model model, HttpServletRequest request) {
		registrationModelValidator.validate(user, bindingResult);
		model.addAttribute("user", user);
//		if (bindingResult.hasErrors()) {
//			return "registration";
//		}
		try {
			String userPassword = user.getPassword();
			user = userDetailService.saveUserDetails(user);

			HttpSession userSession = request.getSession();
			userSession.setAttribute("user", user);

			// password field has to be set as the user object received after registration does not contain password.
			if (StringUtils.isEmpty(user.getPassword())) {
				user.setPassword(userPassword);
			}

			userSession.setAttribute("user", user);

		} catch (Exception ex) {
			ex.printStackTrace();
			logger.error(" Exception occured", ex);
			model.addAttribute("error", ex.getMessage());
			return "registration";
		}

		return "redirect:/loginSuccess";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("userForm", new User());
		return "/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("userForm") User user, BindingResult bindingResult, Model model, HttpServletRequest request, Locale locale) {

		signInModelValidator.validate(user, bindingResult);
		model.addAttribute("userForm", user);
		if (bindingResult.hasErrors()) {
			return "/login";
		}

		HttpSession session = null;

		try {

			session = request.getSession();

			User validUser = userDetailService.authenticateUser(user);
			logger.debug("validUser : " + validUser);

//			if (validUser == null) {
//				String errorMsg = messageSource.getMessage("user.invalid.credentials", null, locale);
//				model.addAttribute("error", errorMsg);
//				return "/login";
//			}



		} catch (Exception ex) {
			logger.error("Exception occured", ex);
			model.addAttribute("error", ex.getMessage());
			return "/login";
		}

		return "redirect:/loginSuccess";
	}
	@RequestMapping(value = "/loginSuccess", method = RequestMethod.GET)
	public String loginSucces(Model model) {
		return "loginSuccess";
	}
}
