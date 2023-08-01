package com.alex.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//here we create a url fuctionality
	//"say-hello" 
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! what are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<h1>My First</h1>");
		sb.append("<p>My first paragraph.</p>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	//use the method JSP
	//sayHello.jsp
	//"say-hello-jsp" => sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
}
