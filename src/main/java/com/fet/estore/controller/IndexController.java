package com.fet.estore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.minidev.json.JSONObject;

@Controller
public class IndexController  {

	
	
	
	//第一支請求
	@RequestMapping("/alex2")
	public String helloThymeleaf2(Model model) {
		model.addAttribute("hello", "hello Thymeleaf！");
		System.out.println("aaa");
		return "index";
	}
	
	
	@RequestMapping("/alex3")
	@ResponseBody
	public String testData(Model model) {
		System.out.println("AAAAAAAAAAAA");
		JSONObject json = new JSONObject();
		json.put("alex", "@@@@@");
		return json.toString();
	}
	
	@RequestMapping("/alex4")
	@ResponseBody
	public String sendData(@RequestBody MultiValueMap<String, Object> formData) {
		System.out.println("============");
		System.out.println(formData);
		
		JSONObject json = new JSONObject();
		json.put("alex", "======");
		return json.toString();
	}
	
	
////	@Autowired
////    private User user;
//	
//	@RequestMapping("/alex")
//	public String helloThymeleaf(Model model){
//		System.out.println(">>>>>導到系統頁");
////		model.addAttribute("hello","hello Thymeleaf！");
//		 model.addAttribute("name", "ALEX-----T");
//		return "index";
//	}
//	
//	@RequestMapping("/alex2")
//	public String helloThymeleaf2(Model model){
//		model.addAttribute("hello","hello Thymeleaf！");
//		
//		System.out.println("aaa");
//		return "thymeleaf_base_layout/base";
//	}
//	
//	
//	 
//	//不合法全部導入燈入頁
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String login() {
//		System.out.println(">>>>>導到登入頁");
//		return "ALEX";
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	@RequestMapping(value = "/err", method = RequestMethod.GET)
//	public ModelAndView accesssDenied(Principal user,HttpServletRequest request,HttpServletResponse response) {
// 
//		
//		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//		
//		System.out.println(">>>>>>>>>>>>>>>>>>>>"+status);
//		System.out.println(user.getName());
////		request.gets
//		
//		ModelAndView model = new ModelAndView();
// 
////		if (user != null) {
////			model.addObject("msg", "Hi " + user.getName() 
////			+ ", you do not have permission to access this page!");
////		} else {
////			model.addObject("msg", 
////			"You do not have permission to access this page!");
////		}
// 
//		model.setViewName("403");
//		return model;
// 
//	}
//
//	  @GetMapping("login_page")
//	  public String login_page() {
//		  return "login";
//	  }
//
//	  @GetMapping("logout_page")
//	  public String logout_page() {
//		  return "logout";
//	  }
//
//	  
//	
//
//	   
//	   @RequestMapping("${server.error.path:${error.path:/error}}")
//	   public class CustomErrorController extends BasicErrorController {
//
//	       @Value("${server.error.path:${error.path:/error}}")
//	       private String path;
//
//	       public CustomErrorController(ServerProperties serverProperties) {
//	           super(new DefaultErrorAttributes(), serverProperties.getError());
//	       }
//	   }
}
