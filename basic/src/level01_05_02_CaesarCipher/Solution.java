package level01_05_02_CaesarCipher;

public class Solution {

	// 이 방법이 안되는 이유?
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
					char num = (char) (strArray[i] - 26 + n); // char이용해서 아스키값 구해주기 //122-97 = 25
					String number = Character.toString(num); // char형을 String으로 변환
					answerArray[i] = number; // 값을 배열에 삽입
				}
			} else if (strArray[i] > 97 && strArray[i] + n > 122) {
				char num = (char) (strArray[i] - 26 + n); // char이용해서 아스키값 구해주기 //122-97 = 25
				String number = Character.toString(num); // char형을 String으로 변환
				answerArray[i] = number; // 값을 배열에 삽입
			} else {
				char num = (char) (strArray[i] + n); // char이용해서 아스키값 구해주기
				String number = Character.toString(num); // char형을 String으로 변환
				answerArray[i] = number; // 값을 배열에 삽입

			}
			answer.append(answerArray[i]);
		}

		// return String.join("", answerArray);//배열을 String으로 변환
		return answer;
	}
}
