package level01_03_intDescending;

import java.util.Arrays;

public class Solution7 {
	public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n); //�Է¹��� û���� ���ڿ��� ����ȯ
        char[] array = str.toCharArray(); //���ڿ� �迭�� ����
 
        Arrays.sort(array); //������������
        StringBuffer sb =new StringBuffer(); //���ڿ��� ���ϱ� ���� StringBuffer ����
        
        for(int i = array.length-1; i>=0; i--) { //������������ ����
        	sb.append(array[i]);
        }
        answer = Long.parseLong(sb.toString()); //longŸ������ ����ȯ �� ����
        
        return answer;
    }
}