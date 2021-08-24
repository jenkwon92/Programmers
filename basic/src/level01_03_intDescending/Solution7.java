package level01_03_intDescending;

import java.util.Arrays;

public class Solution7 {
	public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n); //입력받은 청수를 문자열로 형변환
        char[] array = str.toCharArray(); //문자열 배열로 삽입
 
        Arrays.sort(array); //오름차순정렬
        StringBuffer sb =new StringBuffer(); //문자열을 더하기 위한 StringBuffer 생성
        
        for(int i = array.length-1; i>=0; i--) { //내림차순으로 정렬
        	sb.append(array[i]);
        }
        answer = Long.parseLong(sb.toString()); //long타입으로 형변환 후 리턴
        
        return answer;
    }
}