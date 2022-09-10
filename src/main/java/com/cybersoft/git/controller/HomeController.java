package com.cybersoft.git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

	// ModelAndView :+ tạo giao diện của 1 đường dẫn nào đó
	// + trả ra giá trị cho giao diện xài giống jsp
	@GetMapping("")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");// tên file
		
		int soA=15;
		int soB=10; 
		int soC=7;  
		int soD=10;
		int soF=9;
		int tong=tinhTong(soA, soB);
		
		modelAndView.addObject("ketqua",tong);
		
		
		
		return modelAndView;
	}

	public int tinhTong(int soA, int soB) {
		int tong = 0;
		tong = soA + soB;
		return tong;
	}
}
