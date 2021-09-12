package level01_07_05_Random;

import java.util.Arrays;
import java.util.Comparator;

public class Solution3 {
	public String[] solution(String[] strings, int n) {
	
		Arrays.sort(strings, new Comparator<String>() {
			public int compare(String s1, String s2) {
				char c1 = s1.charAt(n);
				char c2 = s2.charAt(n);
				
				if(c1 == c2) {
					return s1.compareTo(s2); //��������
				}else {
					System.out.println(c1-c2);
					return c1-c2; //�����ϰ�� ���� ����� ��� �״������
				}
			}
		});
		return strings;
	}
}