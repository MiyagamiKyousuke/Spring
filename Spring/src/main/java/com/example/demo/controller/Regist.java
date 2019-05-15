package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.form.RegistConfirmForm;
@Controller
public class Regist {
	@ModelAttribute("registConfirmForm")
	public RegistConfirmForm registForm() {
		RegistConfirmForm registConfirmForm = new RegistConfirmForm();
		return registConfirmForm;

	}
	@RequestMapping(value = "/branchInsert", method = RequestMethod.GET)
	public ModelAndView returnRegist(@ModelAttribute RegistConfirmForm registConfirmForm, ModelAndView model) {
		model.addObject(registConfirmForm);
		model.setViewName("regist");
		return model;

	}


	@RequestMapping(value = "registConfirm", method = RequestMethod.POST)
	public ModelAndView registCheck(@Validated @ModelAttribute RegistConfirmForm registConfirmForm, BindingResult bindingResult, ModelAndView model) {

		if(bindingResult.hasErrors()) {

			return returnRegist(registConfirmForm, model);
		}
//
//		if(registConfirmForm.getLoginPass().equals(registConfirmForm.getLoginPass2())) {
//			bindingResult.rejectValue("date", "validation.password-nomatch");
//		}



		System.out.println(registConfirmForm.getLoginId());
		System.out.println(registConfirmForm.getAddress());
		System.out.println(registConfirmForm.getLoginPass());
		System.out.println(registConfirmForm.getName());
		model.addObject(registConfirmForm);
		model.setViewName("registConfirm");
		return model;

	}
}
