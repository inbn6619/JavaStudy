package java_study.chapter04;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.printf("%d시 %d분 %d초\n", hour, min, sec);

		int year = date.getYear() + 1900;
		int month = date.getMonth() + 1;
		int today = date.getDate();
		System.out.printf("%d년 %d월 %d일\n", year, month, today);

		System.out.printf("%4d-%02d-%02d %02d:%02d:%02d\n", year, month, today, hour, min, sec);
	}
}
