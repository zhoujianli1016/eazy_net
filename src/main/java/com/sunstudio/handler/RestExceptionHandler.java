package com.sunstudio.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.sunstudio.exceptions.RestException;
import com.sunstudio.messages.RestErrorMessage;

/** restful响应异常handler
 * @author Lsatin 2019年11月2日
 */
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	protected ResponseEntity<Object> handlerInvalidRequest(RestException e, ServletWebRequest request) {
		RestErrorMessage errorMessage = new RestErrorMessage(HttpStatus.valueOf(request.getResponse().getStatus()), e.getCode(), e.getMessage(), e.getDetailedMessage(), e.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		return handleExceptionInternal(e, errorMessage, headers, HttpStatus.OK, request);
	}
	
}
