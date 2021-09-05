package level01_06_02_FindPrimeNumber;

public class Solution_success2 { 
	public int solution(int n) {
		int answer = 0;

		for(int i=1; i<=n; i++) {
			for(int a=1; a<=Math.sqrt(i); a++) {
				if(i%a == 0 ) {
					answer++;
				}
			}
			if(answer ==0)
				return answer;
		}
		return answer;
	}
}
