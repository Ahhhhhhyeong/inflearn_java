package chapter08;

import java.util.Scanner;

/**
 * 
 * 순열 구하기
 *
 */
public class Problem06 {
	static int[] pm, ch, arr;
	static int n, m;
	
	private static void DFS(int L) {
		if(L==m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for(int i=0; i<n; i++) {
				if(ch[i] == 0) {
					ch[i]=1;
					pm[L] = arr[i];
					DFS(L+1);
					ch[i]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = in.nextInt();
		ch = new int[n];
		pm = new int[m];
		DFS(0);
	}

}
