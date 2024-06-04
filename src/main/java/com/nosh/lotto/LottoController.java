package com.nosh.lotto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LottoController {
	
	@GetMapping("/main")
	public String main() {
		return "hello World~!";
	}
}
