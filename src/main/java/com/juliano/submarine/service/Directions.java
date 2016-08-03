package com.juliano.submarine.service;

import com.juliano.submarine.model.Movement;


public enum Directions {

	R() {
		public void getDirection(Movement m) {
			CardinalRight.valueOf(m.getCardinal().name()).change(m);
		}
	},
	L() {
		public void getDirection(Movement m) {
			CardinalLeft.valueOf(m.getCardinal().name()).change(m);
		}
	},
	M() {
		public void getDirection(Movement m) {
			m.getCardinal().move(m);
		}
	},
	U() {
		public void getDirection(Movement m) {
			if (m.getZ() < 0) {
				m.setZ(m.getZ()+1);
			}
		}
	},
	D() {
		public void getDirection(Movement m) {
			m.setZ(m.getZ()-1);
		}
	};
	public abstract void getDirection(Movement m);
}