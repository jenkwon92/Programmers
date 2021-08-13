package level01.step5;

public class Solution {
	public Boolean solution(int x) {
		Boolean answer = true;
		int sum = 0;

		while (x < 0) {
			sum += (x % 10);
			if ((sum / x) != 0) {
				answer = !answer;
			} else {
				answer = !answer;
			}
			break;
		}
		return answer;
	}
}
