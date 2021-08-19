package level01.Collatz;

public class Solution {
	public int solution(int num) {
		/*
		 * 1937�� Collatz�� ����� ���� ����� �� ������, 
		 * �־��� ���� 1�� �ɶ����� ���� �۾��� �ݺ��ϸ�, 
		 * ��� ���� 1�� ���� �� �ִٴ� �����Դϴ�. 
		 * �۾��� ������ �����ϴ�.
		 * 
		 * 1-1. �Էµ� ���� ¦����� 2�� �����ϴ�. 
		 * 1-2. �Էµ� ���� Ȧ����� 3�� ���ϰ� 1�� ���մϴ�.
		 * 2. ����� ���� ���� ���� �۾��� 1�� �� ������ �ݺ��մϴ�.
		 */
		 int answer = 0;
		 
		 while(num!=1) {
			 if(num%2==0) {
				 num /=2;
			 }else {
				 num = num*3+1;
			 }
			 answer++;
			 
			 if(answer==500) {
				 answer = -1;
			 }
		 }
	        return answer;
	    }
}