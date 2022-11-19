package chapter10;

import java.util.*;
/**
 * 
 * ������ȯ(���� �˰���)
 *
 */
public class Problem05 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		int m = in.nextInt();
		System.out.println(new Problem05().solution(n, m, arr));
	}

	private int solution(int n, int m, int[] arr) {
		int[] dy = new int[m+1];
		Arrays.fill(dy, Integer.MAX_VALUE);
		dy[0] = 0;
		for(int i=0; i<n; i++) { // arr�ȿ� �������� ���ϱ�
			for(int j=arr[i]; j<=m; j++) { // dy �迭�ȿ� ���� ���� �־��ֱ�
				// arr[i-1]��° �����̶� arr[i]������ �Բ� ����� ��,
				// ���� arr[i-1]��° �� ����� ���� ���ؼ� ���� ����Ѱ� ������ ��ü
				dy[j] = Math.min(dy[j], dy[j - arr[i]] + 1); 
			}			
		}		
		return dy[m];
	}

}
