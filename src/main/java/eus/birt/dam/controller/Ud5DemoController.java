package eus.birt.dam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ud5DemoController {
	@GetMapping("/")
	public String holaMundo() {
		return "index";
	}
}
