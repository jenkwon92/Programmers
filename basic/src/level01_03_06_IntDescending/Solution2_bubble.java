package level01_03_06_IntDescending;

public class Solution2_bubble {
	public long solution(long n) {
		// String.valueof() 메소드를 통하여 long타입을 String타입으로 변경 후,
        // String.toCharArray() 메소드를 통하여 String타입을 char[]로 변경한다.
        char[] arr = String.valueOf(n).toCharArray();
 
        // 임시 char변수
        char temp = 'a';
        // 버블정렬을 통한 숫자 재배치
        for(int i = arr.length - 1; i > -1; i--) {
            for(int j=0; j < i; j++) {
                if(arr[j] < arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // char[] → String
        String str = "";
        for(char i : arr) {
            str += i;
        }
        // Long.parseLong()메소드를 통하여 String → Long타입 변환
        return Long.parseLong(str);
    }
}
