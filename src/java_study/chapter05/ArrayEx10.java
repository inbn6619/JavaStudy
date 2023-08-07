package java_study.chapter05;

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] data = new int[5];

		// ArrayUtil.getNumbers("숫자 입력 >> ", data);

		int[] data = ArrayUtil.getRandomArray(10, 100);

		for (int i = 0; i < data.length; i++) {

			int minIx = ArrayUtil.findMinValue(data, i, data.length);
			ArrayUtil.swap(data, i, minIx);
			ArrayUtil.showNumbers(data);
		}

	}

}
