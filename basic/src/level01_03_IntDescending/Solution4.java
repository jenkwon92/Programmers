package level01_03_IntDescending;

import java.util.Arrays;
import java.util.Collections;

public class Solution4 {
	public long solution(long n) {
		long answer = 0;

		String[] array = ("" + n).split("");
		Arrays.sort(array);
		Collections.reverse(Arrays.asList(array));
		System.out.println(Arrays.toString(array));

		answer = Long.parseLong(String.join("", array));

		return answer;
	}
}
