package java_study.chapter05;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello");
		str = new String("World");
		String str2 = new String("World");
		// 주소가 다름(str != str2)
		if (str == str2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		// 참조값 복사 str2의 주소 기준
		str = str2;
		if (str == str2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		str = null;
		if (str == str2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

}
