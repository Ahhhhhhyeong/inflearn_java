package chapter10;

import java.util.*;

/**
 * 
 * 계단오르기
 *
 */
public class Problem01 {
	static int[] dy;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		dy = new int[n+1];
		System.out.println(new Problem01().solution(n));
	}
	private int solution(int n) {
		dy[1]=1;
		dy[2]=2;		
		for(int i=3; i<=n; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}		
		return dy[n];
	}

}
