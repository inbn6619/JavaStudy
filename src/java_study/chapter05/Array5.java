package java_study.chapter05;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "홍길동", "김길동", "박길동", "송길동", "청길동" };
		int[] ages = { 50, 40, 30, 20, 10 };
		int[] shoes = { 134, 235, 245, 255, 300 };
		char[] gender = { '남', '여', '남', '남', '여' };

		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < ages.length; i++) {
			System.out.print(ages[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < shoes.length; i++) {
			System.out.print(shoes[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < gender.length; i++) {
			System.out.print(gender[i] + " ");
		}
		System.out.println();
	}

}
