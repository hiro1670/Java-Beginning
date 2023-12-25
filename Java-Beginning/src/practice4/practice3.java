package practice4;

public class practice3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = new int[] {3, 4, 9};
		System.out.println("１桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int i = 0; i < numbers.length; i++) {
			if 
			(input == numbers[0] || input == numbers[1] || input == numbers[2]) {
				System.out.println("アタリ！");
				break;
			}
		}
	}

}
