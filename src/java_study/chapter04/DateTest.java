package java_study.chapter04;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth();
		int day = date.getDay();
		System.out.println(day);
		switch (day) {
		case 0:
		case 6:
			System.out.println("자바공부하러가");
			break;
		default:
			System.out.println("확인");
			break;
		}
		System.out.println(month);

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}
}
