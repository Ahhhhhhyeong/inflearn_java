package problem06;

import java.util.*;

public class Problem06 {
	public static void main(String[] args){
	   Scanner in=new Scanner(System.in);
	   int n = in.nextInt();
	   int[] arr = new int[n];
	   for(int i=0; i<n; i++) arr[i] = in.nextInt();
	   solution(n, arr);	
	   return ;
	}
	private static void solution(int n, int[] arr) {
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		for(int i=0; i<n; i++) {
			if(tmp[i] != arr[i]) System.out.printf("%d ", i+1);
		}
	}
}
