package capter5;

public class methodcall {

	public static void methodA() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("methodA");
		methodB();
	}
	public static void methodB() {
		System.out.println("methodB");
	}
	public static void main(String[] args) {
		methodA();
	}
}
