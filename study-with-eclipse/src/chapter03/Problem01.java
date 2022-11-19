package chapter03;
/**
 * 두 배열 합치기
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Problem01 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
    	a[i] = in.nextInt();
    }
    int m = in.nextInt();
    int[] b = new int[m];
    for(int i=0; i<m; i++) {
    	b[i] = in.nextInt();
    }
    
    for(int x : Solution(n, m, a, b)) System.out.printf("%d ", x);
    
    return ;
  }

	private static ArrayList<Integer> Solution(int n, int m, int[] a, int[] b) {
		ArrayList<Integer> result = new ArrayList<>();
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(a[p1] < b[p2]) result.add(a[p1++]);
			else result.add(b[p2++]);
		}
		while(p1<n) result.add(a[p1++]);
		while(p2<m) result.add(b[p2++]);
		
		return result;
	}
  
}