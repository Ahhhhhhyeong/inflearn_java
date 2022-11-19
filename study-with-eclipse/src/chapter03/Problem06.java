package chapter03;

import java.util.*;

public class Problem06 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
    	arr[i] = in.nextInt();
    }
    System.out.println(solution(n, k, arr));
    return ;
  }
  
  public static int solution(int n, int k, int[] arr) {
	  int result=0,  lt=0, cnt=0;
	  for(int rt=0; rt<n; rt++) {
		  if(arr[rt] == 0) cnt++;
		  while(cnt>k) {
			  if(arr[lt] == 0) cnt--;
			  lt++;
		  }
		  result=Math.max(result, rt-lt+1);
	  }
	  return result;
  }
}