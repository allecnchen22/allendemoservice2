package com.example.allendemoservice2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello2")
@RestController
public class Hello2Controller {

	@RequestMapping("/index")
	public String Index() {
		return "Hello2";
	}
	
}
