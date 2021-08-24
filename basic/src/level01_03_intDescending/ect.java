package level01_03_intDescending;

public static void testArraySort2() {
    
    // 버블정렬(Bubble Sort) : 왼쪽(작은값) 오른쪽(큰값)으로 마지막까지 교차 교환
    // 인접한 두 개의 값을 비교하여
    // 더 큰값을 우측으로 보내는 정렬 알고리즘
    // 이미 정렬이 어느 정도 되어 있는 데이터에
    // 대한 수행속도가 매우 빠르며, 구현이 쉽다.
    // 단, 역으로 정렬되어 있는 배열을 정렬 할 때에는
    // 시간 복잡도가 제곱수 배로 증가하여 효율이 급격히 떨어진다.

    int[] array = {6,4,2,1,3,5}; //array.length = 6, []는 5까지
    // 4, 6, 2, 1, 3, 5
    // 4, 2, 6, 1, 3, 5
    // 4, 2, 1, 6, 3, 5
    // 4, 2, 1, 3, 6, 5
    // 4, 2, 1, 3, 5, 6
    
    // 2, 4, 1, 3, 5, 6
    // 2, 1, 4, 3, 5, 6
    // 2, 1, 3, 4, 5, 6
    // 2, 1, 3, 4, 5, 6
    
    // 1, 2, 3, 4, 5, 6
    int temp = 0; // 교환용 임시 변수
    
    // 배열의 길이 -1 (마지막 숫자 제외)
    for(int i = array.length - 1; i > -1; i--) {    // i = 5 → 4 → 3 → 2 → 1 → 0
        for(int j = 0; j < i; j++) {                 // i = 5 : j = 0 → 1 → 2 → 3 → 4 
            if(array[j] > array[j+1]) {             // 0 < 1 → 1 < 2 → 2 < 3 → 3 < 4 → 4 < 5
                temp = array[j];                    // temp에 0을 넣어준다. temp = 6
                array[j] = array[j+1];                // 0에 1을 넣어준다. array[0] = 4
                array[j+1] = temp;                    // 1에 temp를 넣어준다. // array[1] = 6, 교환 성립.
            }
            
        }
    }
    
    System.out.println(Arrays.toString(array)); //arrays클래스의 toString메소드 : []형태로 뽑아서 처리해줌.        
                                                //변수명.toString()를 하게 되면 hashcode값을 가져오게 된다.
}
