package chapter10;

import java.util.Scanner;
/**
 * 
 * 최대부분증가수열(LIS)
 *
 */

public class Problem03 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(new Problem03().solution(n, arr));
	}

	private int solution(int n, int[] arr) {
		int max = Integer.MIN_VALUE;
		int[] dy = new int[n];
		dy[0] = 1;
		for(int i=1; i<n; i++) {
			int tmp = 0;
			for(int j=0; j<i; j++) {
				if(arr[j] < arr[i] && tmp < dy[j]) {
					tmp = dy[j];	
				}
			}
			dy[i] = tmp + 1;
			if(max < dy[i]) max = dy[i];
		}		
		return max;
	}

}
