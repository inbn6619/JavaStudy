package java_study.chapter05;

import java.util.Random;
// import java.util.Scanner;

public class ArrayUtil {
    // static void getNumbers([] data) {
    // Scanner sc = new Scanner(System.in);
    // for (int i = 0; i < data.length; i++) {
    // int num = sc.nextInt();
    // data[i] = num;
    // }
    // }

    static void showNumbers(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    static int findMinValue(int[] data, int start, int end) {

        int min = 0;
        int minIx = 0;
        for (int i = end - 1; i >= start; i--) {
            if (min > data[i]) {
                min = data[i];
                minIx = i;

            }
        }
        return minIx;
    }

    static int findMaxValue(int[] data, int start, int end) {

        int max = 0;
        int maxIx = 0;
        for (int i = start; i < end; i++) {
            if (max < data[i]) {
                max = data[i];
                maxIx = i;

            }
        }

        return maxIx;

    }

    static void swap(int[] data, int ix1, int ix2) {
        int temp;
        temp = data[ix1];
        data[ix1] = data[ix2];
        data[ix2] = temp;
    }

    static int[] getRandomArray(int length, int util) {
        int[] data = new int[length];
        Random r = new Random(5);
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(util);

        }
        return data;
    }

}
