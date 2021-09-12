package level01_07_05_Random;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
	public String[] solution(String[] strings, int n) {

		Arrays.sort(strings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				char c1 = s1.charAt(n);
				char c2 = s2.charAt(n);

				// n��° ���ڰ� ���� ��쿡 ���� ��Ʈ���� ����������
				if (c1 == c2) {
					return s1.compareTo(s2);
				} else
					return c1 - c2;
			}
		});

		return strings;
	}
}
