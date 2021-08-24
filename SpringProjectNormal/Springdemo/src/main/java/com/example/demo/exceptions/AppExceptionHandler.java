package com.example.demo.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.model.response.ErrorMessage;

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler{
	
	/// video7
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request){
		
		String errorMessageDescription = ex.getLocalizedMessage();
		
		if (errorMessageDescription == null) errorMessageDescription = ex.toString();
		
		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);
		
		return new ResponseEntity<Object>(
				errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	/// Video 10
	@ExceptionHandler(value = {NullPointerException.class, UserServiceException.class})
	public ResponseEntity<Object> handleSpecificException(Exception ex, WebRequest request){
		
		String errorMessageDescription = ex.getLocalizedMessage();
		
		if (errorMessageDescription == null) errorMessageDescription = ex.toString();
		
		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);
		
		return new ResponseEntity<Object>(
				errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	/// Video 8
//	@ExceptionHandler(value = {NullPointerException.class})
//	public ResponseEntity<Object> handleNullPointerException(NullPointerException ex, WebRequest request){
//		
//		String errorMessageDescription = ex.getLocalizedMessage();
//		
//		if (errorMessageDescription == null) errorMessageDescription = ex.toString();
//		
//		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);
//		
//		return new ResponseEntity<Object>(
//				errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	/// Video 9
//	@ExceptionHandler(value = {UserServiceException.class})
//	public ResponseEntity<Object> handleUserServiceException(UserServiceException ex, WebRequest request){
//		
//		String errorMessageDescription = ex.getLocalizedMessage();
//		
//		if (errorMessageDescription == null) errorMessageDescription = ex.toString();
//		
//		ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);
//		
//		return new ResponseEntity<Object>(
//				errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	}
}


// Video6
//@ControllerAdvice
//public class AppExceptionHandler extends ResponseEntityExceptionHandler{
//	
//	@ExceptionHandler(value = {Exception.class})
//	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request){
//		return new ResponseEntity<Object>(
//				ex, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//}