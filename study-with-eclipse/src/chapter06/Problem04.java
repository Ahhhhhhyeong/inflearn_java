package chapter06;
/**
 * Least Recently Used
 */
import java.util.Scanner;

public class Problem04 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int s = in.nextInt();
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) arr[i] = in.nextInt();
    for(int x : solution(s, n, arr)) System.out.printf("%d ", x);
    return ;
  }
  public static int[] solution(int s, int n, int[] arr) {
	  int[] c = new int[s];
	  for(int x : arr) {
		  int pos = -1;
		  for(int i=0; i<s; i++) {
			  if(x == c[i]) pos = i;
		  }
		  if(pos==-1) { //miss
			  for(int i=s-1; i>=1; i--) {
				  c[i] = c[i-1];
			  }			  
		  }
		  else { //hit
			  for(int i=pos; i>=1; i--) {
				  c[i] = c[i-1];
			  }
		  }
		  c[0] = x;
	  }
	  return c;
  }
}