package chapter06;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 int N = in.nextInt();
		 int[] arr = new int[N];
		 for(int i=0; i<N; i++) arr[i] = in.nextInt();
		 for(int x : solution(N, arr)) System.out.printf("%d ", x);
	}
	
	private static int[] solution(int n, int[] arr) {
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}		
		return arr;
	}

}
