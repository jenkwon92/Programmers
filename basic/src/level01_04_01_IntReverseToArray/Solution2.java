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
	        	answer[i] = array[i]-'0'; //�ƽ�Ű ������ ���Ǳ� ������ 
	        }
	        //'0' �� ������ ������
	        //	5 	 4	  3	   2   1 ��ſ� 
	        // 53 52 51 50 49  ���� 48�� ���־���ϴµ� ���� '0' �� �ƽ�Ű�ڵ尡48
	        //
	        
	        return answer;
	    }
	}