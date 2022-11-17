package problem07;
/**
 * 
 * 피보나치 수열(재귀활용, 메모이제이션)
 * - for문과 배열이 성능이 더 좋음...
 * - 스택프레임이 돌아가며 메모리 낭비가 심함... 
 * - 중간중간 기록을 하며 하면 접근을 줄일 수 있음
 */
public class Problem04 {
	static int[] fibo;
	public static int DFS(int n) {
		if(n==1) return fibo[n]=1;
		else if(n==2) return fibo[n]=1;
		else return fibo[n]=DFS(n-2)+DFS(n-1);
	}
	public static void main(String[] args) {
		int n = 15;
		fibo = new int[n+1];
		DFS(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
	}

}
