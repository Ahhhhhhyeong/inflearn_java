package problem03;

import java.util.*;

public class Problem04 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
    	arr[i] = in.nextInt();
    }
    System.out.println(solution(n,m,arr));
    return ;
  }
  
  public static int solution(int n, int m, int[] arr) {
	  int result = 0, sum=0, lt=0;
	  for(int rt=0; rt<n; rt++) {
		  sum += arr[rt];
		  if(sum==m) result++;
		  while(sum >= m) {
			  sum -= arr[lt++];
			  if(sum == m) result++;
		  }
	  }	  
	  return result;
  }
}