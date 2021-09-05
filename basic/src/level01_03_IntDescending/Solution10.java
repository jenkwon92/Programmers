package level01_03_IntDescending;

import java.util.Arrays;
import java.util.Collections;

public class Solution10 {
	public long solution(long n) {
		
		String [] array = (n+"").split("");
		//java.util.Collections에서 제공해주는 
		//Collections.reverseOrder()를 이용하여 내림차순을 위한 Comparator 생성
		
		Arrays.sort(array, Collections.reverseOrder());
		Arrays.toString(array);
		
		return Long.parseLong(String.join("", array));
	}
	//long형을 int 으로 바꾸는것보다 String으로 바꿔야 좋은건지?
	// int로 바꾸면 안되는건지 - 숫자가 다운캐스팅되는건가?
	// 
}