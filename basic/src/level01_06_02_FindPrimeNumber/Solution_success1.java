package level01_06_02_FindPrimeNumber;

public class Solution_success1 { 
	public int solution(int n) {
		int answer = 0;

		for (int i = 2; i <= n; i++) {
			int count = 0;
			for (int a = 2; a <= Math.sqrt(i); a++) {
				if (i % a == 0) {
					count++;
					break;
				}
			}
			if (count == 0)
				answer++;
		}
		return answer;
	}
}
