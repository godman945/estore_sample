package com.fet.estore.api;

import java.security.Principal;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestApiController  {

//	@Autowired
//    private User user;
	
	@RequestMapping("/alex")
	public String helloThymeleaf(Model model){
		System.out.println(">>>>>導到系統頁");
//		model.addAttribute("hello","hello Thymeleaf！");
		 model.addAttribute("name", "ALEX-----T");
		return "index";
	}
	
	@RequestMapping("/alex2")
	public String helloThymeleaf2(Model model){
		model.addAttribute("hello","hello Thymeleaf！");
		
		System.out.println("aaa");
		return "thymeleaf_base_layout/base";
	}
	
	
	 
	//不合法全部導入燈入頁
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		System.out.println(">>>>>導到登入頁");
		return "ALEX";
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/err", method = RequestMethod.GET)
	public ModelAndView accesssDenied(Principal user,HttpServletRequest request,HttpServletResponse response) {
 
		
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>"+status);
		System.out.println(user.getName());
//		request.gets
		
		ModelAndView model = new ModelAndView();
 
//		if (user != null) {
//			model.addObject("msg", "Hi " + user.getName() 
//			+ ", you do not have permission to access this page!");
//		} else {
//			model.addObject("msg", 
//			"You do not have permission to access this page!");
//		}
 
		model.setViewName("403");
		return model;
 
	}

	  @GetMapping("login_page")
	  public String login_page() {
		  return "login";
	  }

	  @GetMapping("logout_page")
	  public String logout_page() {
		  return "logout";
	  }

	  
	

	   
	   @RequestMapping("${server.error.path:${error.path:/error}}")
	   public class CustomErrorController extends BasicErrorController {

	       @Value("${server.error.path:${error.path:/error}}")
	       private String path;

	       public CustomErrorController(ServerProperties serverProperties) {
	           super(new DefaultErrorAttributes(), serverProperties.getError());
	       }
	   }
}
