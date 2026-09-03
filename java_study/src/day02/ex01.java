package day02;

import java.util.Arrays;
import java.util.Scanner;

/*
* 1. 프로그램이 시작되면 점수를 입력하라고 출력시킵니다.
* 2. 국어, 영어,수학 
* 3. 각 점수는 반드시 0~ 100 점 사이여야 합니다.
* 4.만약 위 범위를 넘어서면 올바르지 않는점수라고 출력시키고, 재 입력 받습니다.
* 즉, 올바른 점수가 아니면 다음 과목 입력을 할수 없습니다.
* 5. 이렇게 3명의 점수를 입력 받습니다.
* 6. 모든 점수는 배열에 저장이 됩니다.
* 7. 배열은 이중 배열을 사용합니다.
* 8.모든 점수 입력이 끝나면, 순차적으로 1번학생 총점?,
* 평균은 소숫점, 학점?식으로 출력 시키는데, 15
* 학점은 평점 기준으로(평균/10) 9이상은 A,
* 8은 B, 7은 C, 나머지는 F 로 출력시킵니다.
*
 */
public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] scores = new int[3][3];
		String[] subject = {"국어", "영어", "수학"};
		double[] avg = new double[scores.length];
		char grade;
		int input = 0;

		for (int i = 0; i < scores.length; i++) {

			int total = 0;

			for (int j = 0; j < scores[i].length; j++) {

				do {
					System.out.print(subject[j] + " 점수입력 : ");
					input = sc.nextInt();

					if (input < 0 || input > 100) {
						System.out.println("올바르지 않은 점수입니다. 다시 입력하세요.");
					}
				} while (input < 0 || input > 100);

				scores[i][j] = input;
				total += input;
			}

			avg[i] = total / (double) scores[i].length;
		}

		System.out.println(Arrays.toString(avg));

		sc.close();
	}
}