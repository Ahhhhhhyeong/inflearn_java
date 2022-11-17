package problem06;

import java.util.*;

public class Problem08 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = in.nextInt();
		Arrays.sort(arr);		
		System.out.println(solution(n, m, arr));
	}
	private static int solution(int n, int m, int[] arr) {
		int result =0, lt = 0, rt = n-1;
		while(lt<=rt) {
			int mid = (lt + rt) / 2;
			if(arr[mid] == m) {
				result = mid+1;
				break;
			}
			if(arr[mid]>m)rt = mid - 1;
			else lt = mid + 1;
		}		
		return result;
	}

}
