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
		  ������ 0���� 10 ������ �����̴�.
			���ʽ��� S, D, T �� �ϳ��̴�.
			�ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
		  */
		 String dartResult = "1S2D*3T";
		 solution(dartResult);
	}
}
