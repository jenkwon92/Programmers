package level01_04_01_IntReverseToArray;

public class Solution2 {
	 public  int [] solution(long n) {
	        
	        String str = Long.toString(n);
	        char [] chr = str.toCharArray();
	        char [] array = new char[chr.length];
	        
	        int[] answer = new int[array.length];
	        for(int i=0; i<chr.length; i++) {
	        	array[(chr.length-1)-i] =chr[i];
	        }
	        for(int i=0; i<array.length; i++) {
	        	answer[i] = array[i]-'0'; //아스키 값으로 계산되기 때문에 
	        }
	        //'0' 을 뺴주지 않으면
	        //	5 	 4	  3	   2   1 대신에 
	        // 53 52 51 50 49  따라서 48을 빼주어야하는데 문자 '0' 의 아스키코드가48
	        //
	        
	        return answer;
	    }
	}