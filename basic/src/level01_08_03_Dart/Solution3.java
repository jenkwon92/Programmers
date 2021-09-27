package level01_08_03_Dart;

import java.util.Arrays;

public class Solution3 {
	public static int solution(String dartResult) {
		int answer = 0;
		int num = 0;
		int index = 0; // �ε���

		String resultChange = dartResult.replace("10", "t"); // 10�� �ɷ��� t�� ��ȯ
		System.out.println(resultChange);

		int[] score = new int[3]; // 3���� ��ȸ�� �ִ� �����̴ϱ� �߶� ���

		for (int i = 0; i < resultChange.length(); i++) {
			char c = resultChange.charAt(i);
			if ((Character.isDigit(c))) {
				num = Character.getNumericValue(c); // char ���� int������ ��ȯ
			} else if (c == 't') {
				num = 10; // t �ϰ�� ���� 10���� �纯ȯ

			} else if (c == 'S' || c == 'D' || c == 'T') {
				switch (c) {
				case 'S':
					score[index++] = (int) Math.pow(num, 1); // �ڹ�: ���� �Լ� Math.pow() //score ����� �ڿ��� index�� �ڷ� �ٲ������
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
	// �������̳� *�� ���ð�� ��� �պκп� ������ �߰� ���̳ʽ����ٲ���
	public static void main(String[] args) {
		/*
		 * ������ 0���� 10 ������ �����̴�. ���ʽ��� S, D, T �� �ϳ��̴�. �ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
		 */
		String dartResult = "1D2S#10S";
		int answer = solution(dartResult);
		System.out.println(answer);
	}
}
