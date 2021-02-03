//package com.fet.estore.api.exception;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//import com.fet.estore.api.exception.MainsiteErrorController;
//@ControllerAdvice
//public class AcmeControllerAdvice extends ResponseEntityExceptionHandler {
//
//	@ExceptionHandler(value = ProductNotfoundException.class)
//    ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
//        HttpStatus status = getStatus(request);
//        
//        System.out.println("SSSSSSxxxxxxxxx");
//        
////        return new ResponseEntity<>(new CustomErrorType(status.value(), ex.getMessage()), status);
//		return null;
//    }
//
//    private HttpStatus getStatus(HttpServletRequest request) {
//        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
//        if (statusCode == null) {
//            return HttpStatus.INTERNAL_SERVER_ERROR;
//        }
//        return HttpStatus.valueOf(statusCode);
//    }
//
//}
