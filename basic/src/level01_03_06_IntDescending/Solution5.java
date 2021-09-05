package level01_03_06_IntDescending;

import java.util.Arrays;

public class Solution5 {
	public long solution(long n) {
		char[] input = Long.toString(n).toCharArray();
        Arrays.sort(input);
        
        long ans = 0;
        for(int i = input.length -1; i>= 0 ; i--){
            ans += input[i] - '0';
            ans *= 10;
        }
        
        return ans/10;
    }
}
