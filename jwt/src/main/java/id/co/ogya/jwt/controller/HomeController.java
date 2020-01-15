package id.co.ogya.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	String index() {
		return "redirect:/swagger-ui.html";
	}

}
