package com.juliano.submarine.service;

import com.juliano.submarine.model.Movement;


public enum Cardinal {
	
	N(){
		@Override
		public String toString() {
			return "NORTH";
		}
		public void move(Movement m) {
			m.setY(m.getY()+1);
		}
		
	},E(){
		@Override
		public String toString() {
			return "EAST";
		}
		public void move(Movement m) {
			m.setX(m.getX()+1);
		}

	},S(){
		@Override
		public String toString() {
			return "SOUTH";
		}
		public void move(Movement m) {
			m.setY(m.getY()-1);
		}

	},W(){
		@Override
		public String toString() {
			return "WEST";
		}
		public void move(Movement m) {
			m.setX(m.getX()-1);
		}
	};
	
	public abstract void move(Movement m);
}