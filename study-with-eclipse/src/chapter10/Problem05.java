package chapter10;

import java.util.*;
/**
 * 
 * 동전교환(냅색 알고리즘)
 *
 */
public class Problem05 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		int m = in.nextInt();
		System.out.println(new Problem05().solution(n, m, arr));
	}

	private int solution(int n, int m, int[] arr) {
		int[] dy = new int[m+1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i=0; i<n; i++) { // arr안에 동전별로 구하기
			for(int j=arr[i]; j<=m; j++) { // dy 배열안에 더한 값들 넣어주기
				// arr[i-1]번째 동전이랑 arr[i]동전을 함께 사용할 때,
				// 이전 arr[i-1]번째 만 사용한 값과 비교해서 같이 사용한게 작으면 교체
				dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1); 
			}			
		}		
		return dy[m];
	}

}
