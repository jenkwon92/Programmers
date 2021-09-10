package level01_07_03_StringDesc;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public String solution(String s) {
		String[] str = s.split("");
		Arrays.sort(str,Collections.reverseOrder());
		return  String.join("", str);
	}
}
