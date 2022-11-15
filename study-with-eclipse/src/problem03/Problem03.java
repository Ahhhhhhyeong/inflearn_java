package problem03;

import java.util.*;

public class Problem03 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int x = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
    	arr[i] = in.nextInt();
    }
    System.out.println(solution(n, x, arr));
    return ;
  }
  
  public static int solution(int n, int x, int[] a) {
	  int result = 0, sum =0;
	  for(int i=0; i<x; i++) sum += a[i];
	  result = sum;
	  for(int i=x; i<n; i++) {
		  sum+=(a[i]-a[i-x]);
		  result = Math.max(result, sum);
	  }
	  return result;
  }
}