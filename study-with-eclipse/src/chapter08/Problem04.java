package chapter08;

import java.util.Scanner;
/**
 * 
 * 중복순열
 *
 */
public class Problem04 {
	static int[] pm;
	static int n, m;
	public static void DFS(int L) {
		if(L==m) {
			for(int x:pm)System.out.printf("%d ", x);
			System.out.println();
		}
		else {
			for(int i=1; i<=n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		pm = new int[m];
		DFS(0);
	}

}
