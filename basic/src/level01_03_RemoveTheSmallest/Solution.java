package level01_03_RemoveTheSmallest;

class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        
        int[] answer = new int[size - 1];
        
        if(size == 1){
            arr[0] = -1;
            return arr;
        } else {
            int min = Integer.MAX_VALUE;
            int minIdx = 0;
            for(int i = 0; i < size; i++){
                if(arr[i] < min){
                    min = arr[i];
                    minIdx = i;                
                }
            }
 
            int index = 0;
            for(int i = 0; i < size; i++){
                if(i == minIdx)
                    continue;
                else {
                    answer[index] = arr[i];
                    index++;
                }
            }
        }
        
        return answer;
    }
}
