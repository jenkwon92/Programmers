package level01_05_01_SumDivisor;

public class Solution {
	public int solution(int n) {
		 // ���� n�� �Է¹޾� n�� ����� ��� ���� ���� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
		int answer = 0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				answer +=i;
			}
		}
		return answer;

	}
}
