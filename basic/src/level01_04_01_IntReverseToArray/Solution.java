package level01_04_01_IntReverseToArray;

import java.util.Arrays;
import java.util.Collections;
//정확성이 낮은 이유는? 
//long형이니까 숫자가 잘리지 않도록 String으로 변환해주었는데 틀린이유는?
//intDescending 문제와 비슷한 형식인데 다르이유는?


// int (-2,147,483,648- 2,147,483,647)
// long 
public class Solution {
	public int[]  solution(long n) {
		/*자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.*/
		
		long num = n;
		String str = Long.toString(num);
		
		String[] array = (str).split(""); //문자형 배열로 만들어준다음 
		
		for(int i=0; i<array.length; i++) {
			
			System.out.println(array[i]);
		}
		Arrays.sort(array, Collections.reverseOrder()); //sort기능으로 정렬 reverseOrder이용해 역순정렬
		//Arrays.toString(array);
		
		int[] answer = new int[array.length];
		
		for(int i=0; i<array.length; i++) {
			answer[i] = Integer.parseInt(array[i]);
		}
		return answer;
	}
}
