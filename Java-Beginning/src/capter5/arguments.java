package capter5;

public class arguments {
	
	public static void main(String[] args) {
		add(100, 20);
		add(200, 50);
	}
	
	public static void add(int x, int y) {
		int total = x + y;
		System.out.println(x + "+" + y + "=" + total);
	}
}
