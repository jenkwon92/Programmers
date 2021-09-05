package level01_03_04_RemoveTheSmallest;

class Sort {
    public long solution(long n) {
        long answer = 0;
        while(n !=0){
            //((4 * 10 + 3) * 10 + 2) * 10 + 1 = 4321
            answer = answer* 10 + n%10;
            n /= 10;
        }
        return answer == (int) answer ? (int) answer : 0;
    }
}