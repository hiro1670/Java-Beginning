package capter8;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1.勇者を作成
		Hero h = new Hero();
		//2.フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を生み出しました！");
		//3.勇者のメソッドを呼び出してゆく
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}

}
