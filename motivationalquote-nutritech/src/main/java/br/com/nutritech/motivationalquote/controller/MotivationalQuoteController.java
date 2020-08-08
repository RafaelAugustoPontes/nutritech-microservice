package br.com.nutritech.motivationalquote.controller;

import br.com.nutritech.motivationalquote.service.MotivationalQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.nutritech.motivationalquote.dto.MotivationalQuoteResponse;

@RestController
@RequestMapping("/motivational-quote")
public class MotivationalQuoteController {

	@Autowired
	private MotivationalQuoteService motivationalQuoteServiceSpec;

	@GetMapping(produces = "application/json")
	public MotivationalQuoteResponse findRandom() {
		return motivationalQuoteServiceSpec.findRandom();
	}

}
