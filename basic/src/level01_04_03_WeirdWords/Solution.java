package level01_04_03_WeirdWords;

public class Solution {
	public String solution(String s) {
		/*
		 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은
		 * 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
		 * 
		 * 
		 */
		String answer = "";
		String[] list = s.split("");

		int index = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(" ")) {
				index =0;
			} else if (index % 2 == 0) {
				list[i] = list[i].toUpperCase();
				index++;
			} else if (index % 2 != 0) {
				list[i] = list[i].toLowerCase();
				index++;
			}
			answer += list[i];
		}

		return answer;
	}
}
