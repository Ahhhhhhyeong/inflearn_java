package problem06;

import java.util.*;


public class Problem07 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][2];
		for(int i = 0; i<n; i++) {
			for(int j=0; j<2; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		solution(n, arr);
	}
	private static void solution(int n, int[][] arr) {
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return o1[1] - o2[1];
				else return o1[0] - o2[0];
			}
		});
		for(int i = 0; i<n; i++) {
			for(int j=0; j<2; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
