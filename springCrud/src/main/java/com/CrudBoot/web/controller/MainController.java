package com.CrudBoot.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/about")
	public String home(Model m) {
		m.addAttribute("name", "Salman Quadir");
		List<String> list = new ArrayList<String>();
		list.add("item1");
		list.add("item2");
		m.addAttribute("list", list);
		List<String> li1 = List.of("ListItem1", "ListItem2");
		m.addAttribute("list2", li1);
		m.addAttribute("gender", 'F');
		return "views/about";
	}

	@RequestMapping("/contacts")
	public String homePage() {

		return "views/contacts";
	}
	@RequestMapping("/home")
	public String homepg() {

		return "index";
	}
	@GetMapping("/services")
	public String Services() {

		return "views/services";
	}
}
