package level01_05_02_CaesarCipher;

public class Solution {

	// �� ����� �ȵǴ� ����?
	public StringBuilder solution(String s, int n) {
		StringBuilder answer = new StringBuilder();

		char[] strArray = s.toCharArray();
		String[] answerArray = new String[strArray.length];

		for (int i = 0; i < strArray.length; i++) {
			// System.out.println(strArray[i]+n);
			if (strArray[i] == ' ') {
				answerArray[i] = " ";
			} else if (strArray[i] > 65 && strArray[i] + n > 90) {
				if (strArray[i] > 'z') {
					strArray[i] -= -26;
				} else {
					char num = (char) (strArray[i] - 26 + n); // char�̿��ؼ� �ƽ�Ű�� �����ֱ� //122-97 = 25
					String number = Character.toString(num); // char���� String���� ��ȯ
					answerArray[i] = number; // ���� �迭�� ����
				}
			} else if (strArray[i] > 97 && strArray[i] + n > 122) {
				char num = (char) (strArray[i] - 26 + n); // char�̿��ؼ� �ƽ�Ű�� �����ֱ� //122-97 = 25
				String number = Character.toString(num); // char���� String���� ��ȯ
				answerArray[i] = number; // ���� �迭�� ����
			} else {
				char num = (char) (strArray[i] + n); // char�̿��ؼ� �ƽ�Ű�� �����ֱ�
				String number = Character.toString(num); // char���� String���� ��ȯ
				answerArray[i] = number; // ���� �迭�� ����

			}
			answer.append(answerArray[i]);
		}

		// return String.join("", answerArray);//�迭�� String���� ��ȯ
		return answer;
	}
}
