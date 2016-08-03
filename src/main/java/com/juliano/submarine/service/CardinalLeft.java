package com.juliano.submarine.service;

import com.juliano.submarine.model.Movement;

public enum CardinalLeft {

	N() {
		public void change(Movement m) {
			m.setCardinal(Cardinal.W);
		}
	},
	E() {
		public void change(Movement m) {
			m.setCardinal(Cardinal.N);
		}
	},
	S() {
		public void change(Movement m) {
			m.setCardinal(Cardinal.E);
		}
	},
	W() {
		public void change(Movement m) {
			m.setCardinal(Cardinal.S);
		}
	};

	public abstract void change(Movement m);
}