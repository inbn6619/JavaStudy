package java_study.chapter04;

public class ForEx {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			System.out.printf("sum : %d, i : %d\n", sum, i);
			sum += i;
		}
		System.out.println("1~100까지의 합: " + sum);
	}
}
