package chapter06;

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = in.nextInt();
		for(int x : solution(n, arr)) System.out.printf("%d ", x);
		
	}
	private static int[] solution(int n, int[] arr) {
		for(int i=0; i<n; i++) {
			int idx = i;
			for(int j=i+1; j<n; j++) {
				if(arr[idx] > arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
	}
}
