package java_study.chapter04;

public class Switch {

	public static void main(String[] args) {
		String name = "자바";
		switch (name) {
		case "자바":
			System.out.println("1103호로 가세요.");
			break;
		case "파이썬":
			System.out.println("1104호로 가세요.");
			break;
		case "리눅스":
			System.out.println("1102호로 가세요.");
			break;
		default:
			System.out.println("카운터에 가서 문의하세요.");
			break;

		}

	}
}
