package level01_08_03_Dart;

import java.util.Arrays;

public class Solution3 {
	public static int solution(String dartResult) {
		int answer = 0;
		int num = 0;
		int index = 0; // 인덱스

		String resultChange = dartResult.replace("10", "t"); // 10을 걸러서 t로 변환
		System.out.println(resultChange);

		int[] score = new int[3]; // 3번의 기회가 있는 게임이니까 잘라서 계산

		for (int i = 0; i < resultChange.length(); i++) {
			char c = resultChange.charAt(i);
			if ((Character.isDigit(c))) {
				num = Character.getNumericValue(c); // char 값을 int형으로 변환
			} else if (c == 't') {
				num = 10; // t 일경우 숫자 10으로 재변환

			} else if (c == 'S' || c == 'D' || c == 'T') {
				switch (c) {
				case 'S':
					score[index++] = (int) Math.pow(num, 1); // 자바: 제곱 함수 Math.pow() //score 사용한 뒤에는 index를 뒤로 바꿔줘야함
					System.out.println(Arrays.toString(score));
					break;

				case 'D':
					score[index++] = (int) Math.pow(num, 2);
					break;

				case 'T':
					score[index++] = (int) Math.pow(num, 3);
					break;
				}
				System.out.println(Arrays.toString(score));
			} else {
				switch (c) {
				case '*':
					score[index - 1] *= 2;
					if ((index - 2) >= 0) {
						score[index - 2] *= 2;
					}
					num = 0;
					break;

				case '#':
					score[index - 1] *= (-1);
					num = 0;
					break;
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			answer += score[i];
		}
		return answer;
	}

	// unSolved
	// 아차상이나 *이 나올경우 어떻게 앞부분에 점수를 추가 마이너스해줄껀지
	public static void main(String[] args) {
		/*
		 * 점수는 0에서 10 사이의 정수이다. 보너스는 S, D, T 중 하나이다. 옵선은 *이나 # 중 하나이며, 없을 수도 있다.
		 */
		String dartResult = "1D2S#10S";
		int answer = solution(dartResult);
		System.out.println(answer);
	}
}
