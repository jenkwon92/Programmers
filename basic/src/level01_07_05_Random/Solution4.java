package level01_07_05_Random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution4 {
	public String[] solution(String[] strings, int n) {
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<strings.length; i++) {
			list.add(strings[i]);
		}
		Collections.sort(list, new Comparator<String>() {
			public int compare (String s1, String s2) {
				char c1= s1.charAt(n);
				char c2 = s2.charAt(n);
				
				if(c1 ==c2)
					return s1.compareTo(s2);
				else
					return c1-c2;
			}
		});
		
		String[] answer = new String[list.size()];
		
		for(int i=0; i<list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}