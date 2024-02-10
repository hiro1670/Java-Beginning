package capter10;

public class SuperHero extends Hero {
	String name = "ミナト";
	
	int hp = 100;
	
	boolean flying;
	//飛ぶ
	public void fly() {
		this.flying = true;
		
		System.out.println("飛び上がった！");
	}
	//着地する
	public void land() {
		this.flying = false;
		
		System.out.println("着地した！");
	}
}
