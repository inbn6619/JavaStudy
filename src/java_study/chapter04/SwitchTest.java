package java_study.chapter04;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("저녁에 먹을 음식 종류 짜장면, 우동, 라면 >> ");
		String food = sc.next();

		switch (food) {
		case "짜장면":
			System.out.println("중국집으로 ");
			break;
		case "우동":
			System.out.println("일식집으로 ");
			break;
		case "라면":
			System.out.println("분식집으로 ");
			break;
		default:
			System.out.println("집으로 ");

			break;
		}
	}
}
