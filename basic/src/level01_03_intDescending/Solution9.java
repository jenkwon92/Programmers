package level01_03_intDescending;

import java.util.Arrays;
import java.util.Collections;

public class Solution9 {
	public long solution(long n) {
		
		String [] array = (n+"").split(""); //n�� String, split���� �ٽ� �и��ؼ� 
		Arrays.sort(array); 
		Collections.reverse(Arrays.asList(array));
		Arrays.toString(array);
		return Long.parseLong(String.join("",array));
	} 
}