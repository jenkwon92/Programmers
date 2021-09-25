package level01_08_04_MiddleNumber;

class Solution {
	 public String solution(String s) {
		 String answer="";
	        String [] array = new String[s.length()];
	        array = s.split("");
	       int idx = array.length/2;
	       if(array.length%2==0) {
	    	   answer = array[idx-1];
	    	   answer += array[idx];
	       }else {
	    	   answer = array[idx];
	       }
	        
	        return answer;
	    }
}

class Main{
	public static void main(String[] args) {
		String s = "abcde";
		String answer = new Solution().solution(s);
		
		System.out.println(answer);
	}
	
}
