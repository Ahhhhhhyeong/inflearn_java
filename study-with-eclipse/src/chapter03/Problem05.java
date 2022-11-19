package chapter03;
/**
 * 연속된 자연수의 합
 */
import java.util.*;

public class Problem05 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    System.out.println(solution(num));
    return ;
  }
  
  public static int solution(int n) {
	  int result = 0, sum=0, lt=0;
	  int m=n/2+1;
	  int[] arr = new int[m];
	  for(int i=0; i<m; i++) {
		  arr[i] = i+1;
	  }
	  for(int rt=0; rt<m; rt++) {
		  sum += arr[rt];
		  if(sum == n) result++;
		  while(sum >= n) {
			  sum-=arr[lt++];
			  if(sum==n) result++;
		  }
	  }
	  
	  return result;
  }
}