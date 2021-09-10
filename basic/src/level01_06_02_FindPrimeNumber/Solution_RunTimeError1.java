package level01_06_02_FindPrimeNumber;
/*
정확성: 56.3
효율성: 0.0
합계: 56.3 / 100.0
 */
public class Solution_RunTimeError1 {
	public int solution(int n) {
		int answer = 0;
		int count = 0;

		for (int i = 2; i <= n; i++) {
			for (int a = 1; a <= i; a++) {
				if (i % a == 0)
					count++;
			}
			if (count == 2) 
				answer ++;
			count = 0;
		}
		return answer;
	}
}