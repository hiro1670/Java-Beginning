package capter9;

public class Sword {
	
	String name;
	
	int damage;

	public void attack() {
		System.out.println(this.name + "は、攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
}
