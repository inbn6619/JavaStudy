package java_study.chapter05;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int y = 200;

		swap(x, y);

		System.out.printf("x: %d, y: %d\n", x, y);
	}

	static void swap(int x, int y) {

		int num = y;
		y = x;
		x = num;
		System.out.printf("x: %d, y: %d\n", x, y);
	}
}
