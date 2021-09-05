package level01_02_HideNumber;

public class Solution {
	public String solution(String phone_number) {
		String answer = phone_number;
		char[] arr = answer.toCharArray();
		for (int i = 0; i < arr.length - 4; i++) {
			arr[i] = '*';
		}
		answer = String.valueOf(arr);
		return answer;
	}
}
