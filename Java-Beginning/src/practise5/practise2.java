package practise5;

public class practise2 {
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		email("メールのタイトル", "メールの宛先アドレス", "メールの本文");
	}
}
