package java_study.chapter05;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[2];
		names[0] = "홍길동";
		names[1] = "김길동";
		for (String x : names) {
			System.out.println(x);
		}
		System.out.println("개수: " + names.length);
		String[] names2;
		names2 = new String[] { "a", "b" };
		System.out.println(names[0].length());
		String s = "홍길동";
		System.out.println(s.charAt(0));
	}

}
