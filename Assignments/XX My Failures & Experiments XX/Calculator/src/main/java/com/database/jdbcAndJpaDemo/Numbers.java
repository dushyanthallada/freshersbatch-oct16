package com.database.jdbcAndJpaDemo;

public class Numbers {
	
	private long a;
	private long b;
	
	public Numbers() {

	}
	public void setA(long a) {
		this.a = a;
	}
	public void setB(long b) {
		this.b = b;
	}
	public long getA() {
		return a;
	}
	public long getB() {
		return b;
	}
	@Override
	public String toString() {
		return "Numbers [a=" + a + ", b=" + b + "]";
	}
	
	
}
