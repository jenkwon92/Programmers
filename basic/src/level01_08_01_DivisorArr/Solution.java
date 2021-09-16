package level01_08_01_DivisorArr;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor ==0)
                list.add(arr[i]);
        }
        
        if(list.size() ==0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[list.size()];
            for(int a=0; a<list.size(); a++){
                 answer[a] = list.get(a);
            }
        }
        Arrays.sort(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		int [] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		int[] answer = solution(arr,divisor);
		System.out.println(Arrays.toString(answer));

	}
}