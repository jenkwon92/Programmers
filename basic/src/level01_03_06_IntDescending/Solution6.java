package level01_03_06_IntDescending;

import java.util.Arrays;

public class Solution6 {
	public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n); // �Է¹��� ������ ���ڿ��� ����ȯ
        char[] aa = str.toCharArray(); // ���ڿ��� �迭�� ����
        
        Arrays.sort(aa); // ������������ ����
        StringBuffer sb = new StringBuffer(); // ���ڿ��� ���ϱ� ���� stringBuffer ����
        
        for( int i = aa.length-1; i>=0; i-- ) { // ������������ ����
        	sb.append(aa[i]);
        }
        answer = Long.parseLong(sb.toString()); // Long Ÿ������ ����ȯ �� ����
        return answer;
    }
}