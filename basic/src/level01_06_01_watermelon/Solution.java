package level01_06_01_watermelon;

public class Solution {
	public String solution(int n) {
		String answer = "수박수박수박수박수박";
		answer = answer.substring(0, n);
		return answer.toString();
	}
}