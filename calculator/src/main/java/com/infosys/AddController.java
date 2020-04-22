package com.infosys;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.infosys.service.AddService;
@Controller
public class AddController {
	@RequestMapping("/add")	
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		int first=Integer.parseInt(request.getParameter("t1"));
		int second=Integer.parseInt(request.getParameter("t2"));
		//System.out.println(first+second);
		
		mv.setViewName("show.jsp");
		AddService addservice=new AddService();
		mv.addObject("p",addservice.add(first,second));
		System.out.println(mv);
		return mv;
	}
}
