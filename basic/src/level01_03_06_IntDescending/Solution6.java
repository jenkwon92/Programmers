package level01_03_06_IntDescending;

import java.util.Arrays;

public class Solution6 {
	public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n); // 입력받은 정수를 문자열로 형변환
        char[] aa = str.toCharArray(); // 문자열을 배열로 삽입
        
        Arrays.sort(aa); // 오름차순으로 정렬
        StringBuffer sb = new StringBuffer(); // 문자열을 더하기 위한 stringBuffer 생성
        
        for( int i = aa.length-1; i>=0; i-- ) { // 내림차순으로 정렬
        	sb.append(aa[i]);
        }
        answer = Long.parseLong(sb.toString()); // Long 타입으로 형변환 후 리턴
        return answer;
    }
}