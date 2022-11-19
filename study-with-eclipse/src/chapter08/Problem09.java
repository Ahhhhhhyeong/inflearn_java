package chapter08;

import java.util.Scanner;

/**
 * 
 * 조합 구하기
 *
 */

public class Problem09 {
	static int[] combi;
	static int n, m;
	
	public void DFS(int L , int s) {
		if(L==m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i=s; i<=n; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}

	public static void main(String[] args) {
		Problem09 T = new Problem09();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		combi = new int[m];
		T.DFS(0, 1);

	}

}
