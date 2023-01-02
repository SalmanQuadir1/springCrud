package com.CrudBoot.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CrudBoot.web.dao.LoginDataRepository;
import com.CrudBoot.web.entities.LoginData;

@Controller
public class LoginController {

	@Autowired
	private LoginDataRepository loginDataRepo;

	@RequestMapping("/")
	public String homepg(Model m) {
		m.addAttribute("loginData", new LoginData());
		return "index";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("loginData") LoginData ld, BindingResult bindingResult) {
		System.out.println(ld.isAgreed());
		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult);
			return "index";

		}
		LoginData logindata = loginDataRepo.save(ld);
		System.out.println(logindata);
		return "views/contacts";
	}
}
