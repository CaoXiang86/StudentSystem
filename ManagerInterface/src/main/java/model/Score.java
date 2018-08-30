package model;

import java.io.Serializable;

public class Score implements Serializable{

	private String name;
	private int math;
	private int english;
	private int physics;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	@Override
	public String toString() {
		return "Score [name=" + name + ", math=" + math + ", english=" + english + ", physics=" + physics + "]";
	}
	
	
}
