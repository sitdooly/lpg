package com.ezen.koh6;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping(value="/index")
	public String ko11() {
		return  "input";
	}
	/*   
	@RequestMapping(value="/savea",method = RequestMethod.POST)
	public String  ko12(HttpServletRequest request,Model mo) {
		String name =request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String phone =request.getParameter("phone");
		int kor=Integer.parseInt(request.getParameter("kor"));
		int eng=Integer.parseInt(request.getParameter("eng"));
		int mat=Integer.parseInt(request.getParameter("mat"));
		ScoreDTO dto = new ScoreDTO();
		dto.setName(name);
		dto.setAge(age);
		dto.setPhone(phone);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMat(mat);
		dto.setTot(kor+eng+mat);
		
		mo.addAttribute("list", dto);
				
		return "out2";
	}
	*/
	/*
	@RequestMapping(value="/savea",method = RequestMethod.POST)
	public ModelAndView  ko13(HttpServletRequest request) {
		String name =request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String phone =request.getParameter("phone");
		int kor=Integer.parseInt(request.getParameter("kor"));
		int eng=Integer.parseInt(request.getParameter("eng"));
		int mat=Integer.parseInt(request.getParameter("mat"));
		ModelAndView mav = new ModelAndView();
		ScoreDTO dto = new ScoreDTO();
		dto.setName(name);
		dto.setAge(age);
		dto.setPhone(phone);
		dto.setKor(kor);
		dto.setEng(eng);
		dto.setMat(mat);
		dto.setTot(kor+eng+mat);
		mav.addObject("message","ModelAndView 전송방식");
		mav.addObject("list",dto);
		mav.setViewName("out2");
		
		return mav;
	}
	*/
	
	@RequestMapping(value="/savea",method = RequestMethod.POST)
	public String   ko14(ScoreDTO scoreDTO) {
		
		return "out2";
	}
	@RequestMapping(value="/im")
	public String   ko15() {
		
		return "out3";
	}
	
}
