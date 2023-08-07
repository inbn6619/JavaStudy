package java_study.chapter05;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jumsu = new int[1000];
		System.out.println(jumsu);

		jumsu[0] = 100;
		jumsu[10] = 200;
		jumsu[999] = 1000;
		System.out.println("첫번째값: " + jumsu[0]);
		System.out.println("11번째값: " + jumsu[10]);
		System.out.println("마지막값: " + jumsu[999]);
		System.out.println("500번째값: " + jumsu[499]);
		System.out.println("");

		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] != 0) {
				System.out.println(jumsu[i] + " " + i);
			}
		}
	}

}
