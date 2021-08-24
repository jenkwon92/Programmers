package level01_03_GcdAndLcm;

public class Solution2 {
	/*
	 * 유클리드 호제법 Euclidean algorithm
	 * 
	 * 유클리드 호제법 또는 유클리드 알고리즘은 2개의 자연수 또는 정식의 최대공약수를 구하는 알고리즘의 하나. 호제법이란 두 수가 서로 상대방
	 * 수를 나누어서 결국 원하는 수를 얻는 알고리즘을 나타냄.
	 * 
	 * 
	 * 2개의 자연수를 받아 최대공약수를 받기 위해 2부터 두 자연수 중 작은 자연수까지 모두 나누어보면서 가장 큰 공약수를 구할 수 있다. 위와
	 * 같은 방법으로 문제를 풀면 시간복잡도는 O(N)이 된다. 나쁜 방법은 아니지만 효율을 높이기 위해 유클리드 호제법이란 알고리즘을 사용하면
	 * 시간복잡도를 O(logN)으로 줄일 수 있다.
	 * 
	 * 2개의 자연수 a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면 (단 a>b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다
	 * 성질에 따라, b를 r로 나눈 나머지 r0를 구하고, 다시 r을 r0로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때
	 * 나누는 수가 a와 b의 최대공약수이다
	 * 
	 * GCD(A,B) = GCD(B,A %B) if A%B = 0 -> GCD =B else GCD(B,A%B)
	 * 
	 * 1. 입력으로 두 수 m,n(m>n)이 들어온다. 2. n이 0이라면, m을 출력하고 알고리즘을 종료한다. 3. m이 n으로 나누어
	 * 떨어지면, n을 출력하고 알고리즘을 종료한다. 4. 그렇지 않으면, m을 n으로 나눈 나머지를 새롭게 m에 대입하고, m과 n을 바꾸고
	 * 3번으로 돌아온다.
	 * 
	 * public static int gcd(int p, int q) { if (q == 0) return p; return
	 * gcd(q,p%q); }
	 * 
	 * 두 수 a, b E Z 이고, r = a % b 이라고 한다. (r 은 a에 b를 나눈 나머지를 의미) 이 때 r은 (0 <= r < b)
	 * 이고, a >= b 이다. 이 때 a 와 b의 최대공약수를 (a, b)라고 할 때 (a, b)의 최대공약수는 (b, r)의 최대공약수와
	 * 같다. 즉, 아래와 같다는 의미다. GCD(a, b) = GCD(b, r)
	 */

	/*
	 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음
	 * 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는
	 * [3, 12]를 반환해야 합니다.
	 */

	public int[] solution(int n, int m) {

		int a = n;
		int b = m;
		
		int gcd= 0;
		
		while( b!=0) {
			int r = a%b;
			a = b;
			b = r;
			gcd =a;
		}
		
		int[] answer = new int[2];
		answer[0] = gcd;
		answer[1] = n * m / answer[0];
		return answer;
	}	
	
	
	/*
	 	public int[] solution(int n, int m) {

		int[] answer = new int[2];
		answer[0] = gcd(n, m);
		answer[1] = n * m / answer[0];
		return answer;
	}

	static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}

	 */
}
