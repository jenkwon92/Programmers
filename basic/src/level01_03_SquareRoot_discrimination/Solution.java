package level01_03_SquareRoot_discrimination;

public class Solution {
	/*
	  임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
		n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고,
		n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
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
