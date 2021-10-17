package level_01_11_01_Remainder1;

public class Solution {
	public int solution(int n) {
		int answer = 0;
		int num = n;

		for (int i = num; i > 1; i--) {
			if (n % i == 1)
				answer = i;
		}

		return answer;
	}
}