package chapter08;
/**
 * 조합수(메모이제이션)
 */

import java.util.Scanner;

public class Problem07 {
	static int[][] dy = new int[35][35]; //memo
	
	private static int DFS(int n, int r) {
		if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return  dy[n][r]=DFS(n-1, r-1) + DFS(n-1, r);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    int r = in.nextInt();
	    System.out.println(DFS(n, r));
	    return ;
	}
}
