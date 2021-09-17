package level01_08_03_Dart;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	 public static int solution(String dartResult) {
	        int answer = 0;
	       ArrayList list = new ArrayList(dartResult.length());
	        for(int i=0; i<list.size(); i++) {
	        	list.add(dartResult.indexOf(i));
	        	System.out.println(Arrays.toString());
	        }
	        return answer;
	    }

	 public static void main(String[] args) {
		 /*
		  점수는 0에서 10 사이의 정수이다.
			보너스는 S, D, T 중 하나이다.
			옵선은 *이나 # 중 하나이며, 없을 수도 있다.
		  */
		 String dartResult = "1S2D*3T";
		 solution(dartResult);
	}
}
