package problem06;

import java.util.*;

public class Problem09 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i] = in.nextInt();
		System.out.println(solution(n, m, arr));
	}
	
	private static int solution(int n, int m, int[] arr) {
		int result =0;
		int lt = Arrays.stream(arr).max().getAsInt(); //큰 데이터에 큰 값 찾기(min() 사용시 작은값)
		int rt = Arrays.stream(arr).sum(); //합
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2; // DVD1장의 용량(가능여부체크)
			if(count(arr, mid) <= m) {
				result = mid;
				rt = mid-1;
			}
			else lt = mid + 1;			
		}
		
		return result;
	}
	
	private static int count(int[] arr, int capacity) {
		int cnt = 1; // dvd 장 수
		int sum = 0; // dvd에 담아내는 곡 양?(시간?)
		for(int x : arr) {
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			}
			else sum += x;
		}
		return cnt;
	}

}
