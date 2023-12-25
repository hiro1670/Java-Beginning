package capter5;

public class passarguments {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メゾットの呼び出しを終わります");
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}

}
