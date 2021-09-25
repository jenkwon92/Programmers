package level01_08_03_Dart;

import java.util.Stack;

public class Solution {
	 public static int solution(String dartResult) {
	        int answer = 0;
	        Stack<String> stack = new Stack<>();
	        String resultChange = dartResult.replace("10", "t"); //10을 걸러서 t로 변환
	        
	        String[] array = resultChange.split(""); //배열로 끊어줌
	        
	        for(int i=array.length-1; i>=0; i--) { //끊어준 배열을 stack에 꺼꾸로 쌓아줌  	
	        	stack.push(array[i]);
	        }
	       
	        for(int i=0; i<stack.size(); i++) { //A =65 . Z=90
	        	
	        	if(String.) {
	        		
	        	}
	        }
	        
	        return answer;
	 }

	 public static void main(String[] args) {
		 /*
		  점수는 0에서 10 사이의 정수이다.
			보너스는 S, D, T 중 하나이다.
			옵선은 *이나 # 중 하나이며, 없을 수도 있다.
		  */
		 String dartResult = "1S2D*10T";
		 int answer = solution(dartResult);
		 System.out.println(answer);
	}
}
