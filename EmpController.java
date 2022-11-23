package com.sb.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.service.EmpService;
@RestController
public class EmpController {

	private static final Logger logger=LoggerFactory.getLogger(EmpController.class);
	
	@Autowired
	EmpService s;
	
	@RequestMapping("/v1")
	public String Show(){
		logger.info("This is Employ Method1 ");
		
		return "Hello Village World Class";
		
	}
	@RequestMapping("/v2")
	public String print(){
		logger.info("This is Employ Method2");
		return "Hello Employ";
	}
	
	@RequestMapping("/v3")
	public ArrayList load() {

		
		
		logger.info("This is Employ Method3");

		return s.m1();
	}
	/*Modifiy Strat*/
	@RequestMapping("/v3")
	public ArrayList load1() {

		
		
		logger.info("This is Employ Method3");

		return s.m1();
	}
	/*Modified End */
	@RequestMapping("/v4")
	
	public ArrayList load1() {
		
		
		logger.info("This is Employ Names");

		return s.m2();
	}
	@RequestMapping("/v5")
	public ArrayList load2() {
		
		
		logger.info("This is Employ Salary");

		return s.m3();
	}
	@RequestMapping("/v6")
	public ArrayList load3() {
		
		
		logger.info("This is Employ Salary");

		return s.m5();
	}


	

	
}
