package problem07;
/**
 * 
 * �Ǻ���ġ ����(���Ȱ��, �޸������̼�)
 * - for���� �迭�� ������ �� ����...
 * - ������������ ���ư��� �޸� ���� ����... 
 * - �߰��߰� ����� �ϸ� �ϸ� ������ ���� �� ����
 * - - 1. �迭�ȿ� �ִ� ���
 * - - 2. �޸������̼�
 * 
 */
public class Problem04 {
	static int[] fibo;
	public static int DFS(int n) { 
		if(n==1) return fibo[n]=1;
		else if(n==2) return fibo[n]=1;
		else return fibo[n]=DFS(n-2)+DFS(n-1);
	}
	public static int DFS2(int n) {
		if(fibo[n] > 0) return fibo[n];
		if(n==1) return fibo[n]=1;
		else if(n==2) return fibo[n]=1;
		else return fibo[n]=DFS2(n-2)+DFS(n-1);
	}
	public static void main(String[] args) {
		int n = 45;
		fibo = new int[n+1];
		DFS2(n);
		for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
	}
}
