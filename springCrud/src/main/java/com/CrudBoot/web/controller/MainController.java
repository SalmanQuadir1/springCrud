package com.CrudBoot.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/about")
	public String home(Model m) {
		m.addAttribute("name", "Salman Quadir");
		List<String> list = new ArrayList<String>();
		list.add("salman");
		list.add("Quadir");
		m.addAttribute("list", list);
		List<String> li1 = List.of("salman", "Quadir");
		m.addAttribute("list2", li1);
		m.addAttribute("gender", 'F');
		return "views/about";
	}
	@RequestMapping("/base")
	public String homePage() {
		
		
		return "views/base";
	}
}
