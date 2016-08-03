package com.juliano.submarine.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.juliano.submarine.model.Movement;
import com.juliano.submarine.service.Cardinal;
import com.juliano.submarine.service.Directions;

public class SubmarineTest {

	private Movement m;
	
	@Before
	public void init() {
		m = new Movement();
		m.setX(0L);
		m.setY(0L);
		m.setZ(0L);
		m.setCardinal(Cardinal.N);
	}
	
	@Test
	public void teste() {
		String teste = "RMMLMMMDDLL";
		
		String[] array =  teste.split("(?!^)");
		
		for (String s : array){
			Directions.valueOf(s).getDirection(m);
		}
		System.out.println(m.toString());
		Assert.assertEquals("Sucesso", m.toString(), "2 3 -2 SOUTH");
	}
}