package level01_03_intDescending;

import java.util.Arrays;

public class Solution {
	public long solution(long n) {
		/*
		 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
		 */

		long answer = 0;
		
		//String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환한다.
		String i = String.valueOf(n); // Returns the string representation of the long argument. 
		
		char[] sol = i.toCharArray(); //Converts this string to a new character array
		Arrays.sort(sol);
		
		i = new StringBuilder(new String(sol)).reverse().toString();
		answer = Long.parseLong(i);
		return answer;

	}
}
