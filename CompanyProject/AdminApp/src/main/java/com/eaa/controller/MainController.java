package com.eaa.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eaa.lib.CommonUtil;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MainController {
	
	@GetMapping("")
	public String viewHomePage(Model model){
		log.debug("--- viewHomePage ---");
		String appName = CommonUtil.getAppName();
		model.addAttribute("appName", appName);
		return appName;
	}

}
