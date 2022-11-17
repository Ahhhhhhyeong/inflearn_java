package problem06;

import java.util.*;

public class Problem10 {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 int n = in.nextInt();
		 int c = in.nextInt();
		 int[] arr = new int[n];
		 for(int i=0; i<n; i++) arr[i] = in.nextInt();
		 System.out.println(solution(n, c, arr));
	}
	
	private static int solution(int n, int c, int[] arr) {
		int result = 0;
		Arrays.sort(arr);
		int lt=1, rt=arr[n-1];		
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			if(count(arr, mid)>=c) {
				result = mid;
				lt = mid+1;
			}
			else {
				rt = mid-1;
			}
		}		
		return result;
	}
	
	private static int count(int[] arr, int dist) {
		int cnt = 1;
		int ep = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]-ep>=dist) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}

}
