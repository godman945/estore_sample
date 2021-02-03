package com.fet.estore.api.exception;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainsiteErrorController implements ErrorController {
	private static final String ERROR_PATH = "/error";

//	@RequestMapping(value = ERROR_PATH)
	
	@RequestMapping(value = "/err404")
	public String handleError() {
		System.out.println("FFFFFFFFFFFFFFFFFFFFFFFFFFF");
		
		return "404";
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
}