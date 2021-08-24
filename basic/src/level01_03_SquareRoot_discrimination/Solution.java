package level01_03_SquareRoot_discrimination;

public class Solution {
	/*
	  ������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
		n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�,
		n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
	 */
	
	 public long solution(long n) {
	        long answer = -1;
	        double  doubleSqrt = Math.sqrt(n); //Returns the correctly rounded positive square root of a double value.
	        int intSqrt = (int)doubleSqrt;
	        
	        if(doubleSqrt % intSqrt ==0) {
	        	System.out.println(doubleSqrt);
	        	double doubleAnswer = (intSqrt+1)*(intSqrt+1);
	        	answer = (long)doubleAnswer;
	        	
	        }
	        return answer;
	    
	}
}
