package org.gfg.sb.api.crud.crudapiexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@RequestMapping("/")
	public String test() {
		return "API Server is running!";
	}
}
