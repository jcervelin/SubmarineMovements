package com.juliano.submarine.model;

import org.springframework.stereotype.Component;

import com.juliano.submarine.service.Cardinal;

@Component
public class Movement {
	
	public Movement() {
		this.setX(0L);
		this.setY(0L);
		this.setZ(0L);
		this.setCardinal(Cardinal.N);
	}
	
	 private Cardinal cardinal;
	
	 private Long x;
	
	 private Long y;
	
	 private Long z;

	/**
	 * @return the cardinal
	 */
	public Cardinal getCardinal() {
		return cardinal;
	}

	/**
	 * @param cardinal the cardinal to set
	 */
	public void setCardinal(Cardinal cardinal) {
		this.cardinal = cardinal;
	}

	/**
	 * @return the x
	 */
	public Long getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(Long x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public Long getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(Long y) {
		this.y = y;
	}

	/**
	 * @return the z
	 */
	public Long getZ() {
		return z;
	}

	/**
	 * @param z the z to set
	 */
	public void setZ(Long z) {
		this.z = z;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return x + " " + y + " " + z + " " + cardinal.toString();
	}
}