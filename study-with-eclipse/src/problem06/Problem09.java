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
		int lt = Arrays.stream(arr).max().getAsInt(); //ū �����Ϳ� ū �� ã��(min() ���� ������)
		int rt = Arrays.stream(arr).sum(); //��
		
		while(lt <= rt) {
			int mid = (lt + rt) / 2; // DVD1���� �뷮(���ɿ���üũ)
			if(count(arr, mid) <= m) {
				result = mid;
				rt = mid-1;
			}
			else lt = mid + 1;			
		}
		
		return result;
	}
	
	private static int count(int[] arr, int capacity) {
		int cnt = 1; // dvd �� ��
		int sum = 0; // dvd�� ��Ƴ��� �� ��?(�ð�?)
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
