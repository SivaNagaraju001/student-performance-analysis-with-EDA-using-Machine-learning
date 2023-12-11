package com.saleshistory.advice;

import java.nio.file.AccessDeniedException;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.saleshistory.dto.ApiError;

import jakarta.persistence.EntityNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiError> handle(Exception e) {
		ApiError error = new ApiError();
		error.setMsg(e.getMessage());
		error.setStatus(404);
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatusCode.valueOf(404));
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<String> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body("Bad Request.Invalid input. Please provide a valid integer.");
	}

	@ExceptionHandler(JpaSystemException.class)
	public ResponseEntity<String> handleJpaSystemException(JpaSystemException ex) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body("An error occurred while processing the request.");
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid argument provided. Please check and retry.");
	}

//	@ExceptionHandler(AccessDeniedException.class)
//	public ResponseEntity<String> handleAccessDenied(AccessDeniedException ex) {
//		return ResponseEntity.status(HttpStatus.FORBIDDEN)
//				.body("Access denied. You do not have permission to access this resource.");
//	}// 403

	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<String> handleEntityNotFound(EntityNotFoundException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				.body("Requested entity not found.");
	}
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<String> handleMethodNotAllowed(HttpRequestMethodNotSupportedException ex) {
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED)
				.body("HTTP method not supported for this request.");
	}// 405
	
	@ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<String> handleAccessDeniedException(AccessDeniedException ex) {
        // Customize the response message as needed
        String errorMessage = "Access denied: " + ex.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.UNAUTHORIZED);
    }
}
