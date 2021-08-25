package level01_04_02_AddDigit;

public class Solution {
	/*
	 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���. ������� N = 123�̸�
	 * 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
	 */

	public int solution(int n) {
		int answer = 0;
		int num = n;
		
		while(num != 0) {
			answer += num%10;
			num/=10;
		}
		
		return answer;
	}
}
