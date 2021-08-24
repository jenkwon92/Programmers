package level01_03_Collatz;

public class Solution_final {
	public int solution(long num) {
		 int answer = 0;
		 
		 while(num!=1) {
             if(answer>=500) {
				 answer = -1;
			 }
            
			 if(num%2==0) {
				 num /=2;
			 }else {
				 num = num*3+1;
			 }
			 answer++;
			 
			 
		 }
	        return answer;
	    }
}