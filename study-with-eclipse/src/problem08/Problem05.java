package problem08;
/**
 * 동전교환 
 * - 거스름돈을 가장 적은 수의 동전으로 교환하기
 */
import java.util.*;

public class Problem05 {
	static int result=Integer.MAX_VALUE, m, n;
	static Integer[] arr;
	
	private static void DFS(int L, int sum) {
		if(L>=result) return;
		if(sum>m) return;
		if(sum == m) {
			result = Math.min(result, L);
			return;
		}
		else {
			for(int i=0; i<n; i++) {
				DFS(L+1, sum+arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    n = in.nextInt();
	    arr = new Integer[n];
	    for(int i=0; i<n; i++) arr[i] = in.nextInt();
	    Arrays.sort(arr, Collections.reverseOrder());
	    m = in.nextInt();
	    DFS(0, 0);
	    System.out.println(result);
	    return ;
	}

}
