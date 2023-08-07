package java_study.chapter04;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int draw = 0;
		int meWin = 0;
		int comWin = 0;

		while (true) {
			int computer = r.nextInt(3);
			System.out.println("0:가위, 1:바위, 2:보, -1: 종료 >> ");
			int me = sc.nextInt();

			if (me == -1) {
				System.out.println("게임이 종료되었습니다.");
				System.out.printf("게임 결과 승리 : %d, 패배 : %d, 무승부 : %d, 승률 : %.2f\n", meWin, comWin, draw,
						(double) meWin / (comWin + meWin));
				break;
			}

			System.out.printf("컴퓨터 : %d, 나 : %d\n", computer, me);

			if (me == computer) {
				draw += 1;
				System.out.println("비겼습니다.");

			} else if (me > computer && computer != 0) {
				meWin += 1;
				System.out.println("내가 이겼습니다.");

			} else {
				comWin += 1;
				System.out.println("컴퓨터가 이겼습니다.");

			}
		}

	}
}
