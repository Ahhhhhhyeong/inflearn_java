package problem08;

import java.util.*;

/**
 * 
 * �ٵ��� ����(DFS)
 *
 */
public class Problem02 {
	static int answer=Integer.MIN_VALUE, c, n;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    c = in.nextInt(); // Ʈ�� ���ѹ���
	    n = in.nextInt(); // �ٵ��� N����
	    int[] arr = new int[n];
	    for(int i=0; i<n; i++) {
	    	arr[i] = in.nextInt();
	    }
	    DFS(0,0,arr);
	    System.out.println(answer);
	    return ;
	}

	private static void DFS(int L, int sum, int[] arr) {
		if(sum>c) return;
		if(L==n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}		
	}
	
	

}
