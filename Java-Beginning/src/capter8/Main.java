package capter8;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1.勇者を作成
		Hero h = new Hero();
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		//3.勇者のメソッドを呼び出してゆく
		h.slip();
		m1.run();
	}

}
