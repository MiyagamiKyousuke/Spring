package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Task;
import com.example.demo.entity.TaskRepository;
import com.example.demo.form.LoginFormBeans;
@Controller
public class StaHello {

	@Autowired
	TaskRepository taskRepo;

	@ModelAttribute("loginForm")
	 public LoginFormBeans setupForm() {
		LoginFormBeans login = new LoginFormBeans();
	        return login;
	    }

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String staGet() {
		System.out.println(1);

		return "sta";

	}
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView requestLoginForm(@ModelAttribute LoginFormBeans loginForm,ModelAndView model) {
		List<Task> userList = taskRepo.findAll();

		model.addObject("userList", userList);
		model.setViewName("end");

		return model;


//		model.addObject("loginForm", loginForm);
//		model.setViewName("end");
//		return model;

	}

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView helloSpring(ModelAndView model) {
//
//		// 画面描画用のテンプレート名を指定
//		model.setViewName("sta");
//		return model;
//	}

	public ModelAndView aaa() {
		return null;

	}
}
