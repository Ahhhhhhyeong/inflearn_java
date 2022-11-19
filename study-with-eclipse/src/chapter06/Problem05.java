package chapter06;

import java.util.HashMap;
import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) arr[i]=in.nextInt();
		System.out.println(solution(n, arr));
	}
	private static String solution(int n, int[] arr) {
		String result = "U";
		HashMap<Integer, Integer> hs = new HashMap<>();
		for(int x : arr) {
			hs.put(x, hs.getOrDefault(x, 0)+1);
			if(hs.get(x) > 1) return "D";
		}
		return result;
	}
}
