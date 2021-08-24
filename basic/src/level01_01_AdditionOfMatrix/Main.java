package level01_01_AdditionOfMatrix;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		AdditionOfMatrix solution = new AdditionOfMatrix();
		//int[][] arr1 = new int[2][2];
		//int[][] arr2 = new int[2][2];
		Scanner sc = new Scanner(System.in);
		/*
		arr1[0][0] = sc.nextInt();
		arr1[0][1] = sc.nextInt();
		arr1[1][0] = sc.nextInt();
		arr1[1][1] = sc.nextInt();
		*/
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		System.out.println(Arrays.deepToString(arr1));
		System.out.println(Arrays.deepToString(arr2));
		
		int[][] answer = solution.solution(arr1, arr2);
		System.out.println(Arrays.deepToString(answer));
		
	}
}
