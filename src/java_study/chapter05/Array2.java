package java_study.chapter05;

import javax.swing.JOptionPane;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] jumsu = new int[5];

		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			jumsu[i] = Integer.parseInt(data);
		}
		int sum = 0;
		for (int x : jumsu) {
			System.out.print(x + " ");
			sum += x;
		}
		System.out.println();

		System.out.println("전체 합계: " + sum);
		double avg = (double) sum / jumsu.length;
		System.out.println("전체 평균: " + avg);

		sum = 0;
		for (int x : jumsu) {
			if (x >= avg) {
				sum += x;
			}
		}
		System.out.printf("%d이상 되는 합계 : %d\n", (int) avg, sum);

		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= avg) {
				System.out.printf("%d이상인 값이 저장된 인덱스 : %d\n", (int) avg, i);
			}
		}
	}

}
