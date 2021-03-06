package com.tutorial.spring.cloud.eureka.restclient.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason= "")
public class InternalServerError extends RuntimeException {

	private static final long serialVersionUID = -5465221880509061197L;

}
