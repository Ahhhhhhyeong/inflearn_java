package chapter07;
/**
 * 
 * ������ ���(���)
 *
 */

public class Problem02 {
	public static void DFS(int n) {
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.printf("%d ", n%2);
		}
	}
	
	public static void main(String[] args) {
		DFS(11);
	}
}
