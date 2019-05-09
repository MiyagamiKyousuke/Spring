package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRepository;
import com.example.demo.form.RegistResultForm;


@Controller
public class RegistResult {

	@Autowired
	UserRepository userRepo;

	@ModelAttribute("registConfirmForm")
	public RegistResultForm registForm() {
		RegistResultForm registResultForm = new RegistResultForm();
		return registResultForm;

	}
	@RequestMapping(value = "registResult", method = RequestMethod.POST)
	 @Transactional(readOnly = false)
	public ModelAndView registResult(@ModelAttribute RegistResultForm registResultForm, ModelAndView model) {

		User user = new User();
		user.setName(registResultForm.getName());
		user.setAddress(registResultForm.getAddress());
		user.setLoginId(registResultForm.getLoginId());
		user.setLoginPass(registResultForm.getLoginPass());
		user.setCreateDate(new Date());

		// 登録
		userRepo.save(user);
		model.addObject(registResultForm);
		model.setViewName("registResult");
		return model;

	}
}
