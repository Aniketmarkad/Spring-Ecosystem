package com.aniket.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.aniket.bean.MyErrorResponse;
import com.aniket.exception.ProductNotFoundException;

@RestControllerAdvice
public class MyCustomExceptionHandler {

	/*@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> showCustomErrorMsg(ProductNotFoundException pnfe)
	{
		return new ResponseEntity<String>(
				pnfe.getMessage(),
				HttpStatus.INTERNAL_SERVER_ERROR
				);
	}
	*/

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<MyErrorResponse> showCustomErrorMsg(ProductNotFoundException pnfe)
	{
		return new ResponseEntity<MyErrorResponse>(
				new MyErrorResponse(new Date().toString(),"EXCEPTION IN PROGESS",500,pnfe.getMessage()),
				HttpStatus.INTERNAL_SERVER_ERROR
				);
	}
}
