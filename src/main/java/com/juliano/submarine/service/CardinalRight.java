package com.juliano.submarine.service;

import com.juliano.submarine.model.Movement;


public enum CardinalRight {

	N() {
		public void change(Movement m) {
			m.setCardinal(Cardinal.E);
		}
	},
	E() {
		public void change(Movement m) {
			m.setCardinal(Cardinal.S);
		}
	},
	S() {
		public void change(Movement m) {
			m.setCardinal(Cardinal.W);
		}
	},
	W() {
		public void change(Movement m) {
			m.setCardinal(Cardinal.N);
		}
	};

	public abstract void change(Movement m);
}