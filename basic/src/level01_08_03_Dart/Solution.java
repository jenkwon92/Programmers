package level01_08_03_Dart;

import java.util.Stack;

public class Solution {
	 public static int solution(String dartResult) {
	        int answer = 0;
	        Stack<String> stack = new Stack<>();
	        String resultChange = dartResult.replace("10", "t"); //10�� �ɷ��� t�� ��ȯ
	        
	        String[] array = resultChange.split(""); //�迭�� ������
	        
	        for(int i=array.length-1; i>=0; i--) { //������ �迭�� stack�� ���ٷ� �׾���  	
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
		  ������ 0���� 10 ������ �����̴�.
			���ʽ��� S, D, T �� �ϳ��̴�.
			�ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
		  */
		 String dartResult = "1S2D*10T";
		 int answer = solution(dartResult);
		 System.out.println(answer);
	}
}
