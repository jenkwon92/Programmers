package level01_09_02_SecretMap;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	 public String[] solution(int n, int[] arr1, int[] arr2) {
	        String[] answer = {};
	        //String binaryString = Integer.toBinaryString(i) //이진수 변환
	        ArrayList<String> binaryStringArr1 = new ArrayList<String>();
	        ArrayList<String> binaryStringArr2 = new ArrayList<String>();
	        ArrayList<String> binaryStringArr3 = new ArrayList<String>();
	        String zeroAdd ="";
	        
	        for(int i=0; i<arr1.length; i++){
	        	Integer.toBinaryString(arr1[i]);
	            binaryStringArr1.add();
	            binaryStringArr2.add(Integer.toBinaryString(arr2[i]));
	        }
	        
	       for(int i=0; i<binaryStringArr1.size();i++) {
	    	   if(binaryStringArr1.get(i).length()!=5 || binaryStringArr2.get(i).length()!=5) {
					/* binaryStringArr1.get(i).replaceFirst("0", binaryStringArr1.get(i)); */
	    		   binary
	    		   binaryStringArr2.get(i).startsWith("0");
	    	   }	
	    	   for(int a=0; a<binaryStringArr1.get(i).length(); a++) {
	    		if(binaryStringArr1.get(i).charAt(a)==binaryStringArr2.get(i).charAt(a)) {
	    			  
	    			  System.out.println(binaryStringArr1);
	    		}
	    	   }
	       }
	       System.out.println(binaryStringArr1.get(0));
	        return answer;
	    }
	
	public static void main(String[] args) {
		int n = 5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};
		String[] answer = new Solution().solution(n, arr1, arr2);
		
		System.out.println(Arrays.toString(answer));
		

	}

}
