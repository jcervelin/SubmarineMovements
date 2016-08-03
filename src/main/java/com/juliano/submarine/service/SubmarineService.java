package com.juliano.submarine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.juliano.submarine.model.Movement;

@Component
public class SubmarineService {
	
	@Autowired
	private Movement m;
	
	public String start(String commands) {
		//commands = "RMMLMMMDDLL";
		//Split commands
		String[] array =  commands.split("(?!^)");
		
		for (String s : array){
			Directions.valueOf(s).getDirection(m);
		}
		return m.toString();
	}
}