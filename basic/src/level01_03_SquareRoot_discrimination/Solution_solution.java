package level01_03_SquareRoot_discrimination;

public class Solution_solution {
		public long solution(long n) {
			long answer = -1;
			for (long i = 0; i < n; i++) {
				if (i * i == n) {
					answer = (i + 1) * (i + 1);
				}
			}
			return answer;
		}
	
}
