package chapter10;
/**
 * 돌다리 건너기 (DP)
 */
import java.util.Scanner;

public class Problem02 {
	static int[] dp;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		dp = new int[n+1];
		System.out.println(new Problem02().solution(n));
	}

	private int solution(int n) {
		dp[0] =1;
		dp[1] =2;
		for(int i=2; i<=n; i++) { // 돌다리는 끝까지 가야함
			dp[i] = dp[i-2] + dp[i-1];
		}		
		return dp[n];
	}

}
