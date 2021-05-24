package com.cts.cit.exception;



import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;





@ControllerAdvice
public class ExceptionHandlerControllerAdvice {
	
	@ExceptionHandler(ApplicationException.class)

	public String handleException(ApplicationException error, Model model) {
		model.addAttribute("msg", error.getMessage());
		return "error1";
	}	
		
	}

