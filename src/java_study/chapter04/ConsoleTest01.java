package java_study.chapter04;

import java.util.Scanner;

public class ConsoleTest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력>> ");

		String name = sc.next();
		System.out.print("소속을 입력>> ");
		String company = sc.next();

		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 소속은 " + company);

		System.out.print("요일 입력: 주중1 ) 주말2)");

		int data = sc.nextInt();

		if (data == 1) {
			System.out.println("열심히 공부합시다.");
		} else {
			System.out.println("열심히 놀아봅시다.");

		}
	}

}
