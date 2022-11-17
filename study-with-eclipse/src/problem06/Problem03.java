package problem06;
/**
 * ���� ����
 */
import java.util.Scanner;

public class Problem03 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) arr[i] = in.nextInt();
    for(int x : solution(n, arr)) System.out.printf("%d ", x);
    return ;
  }
  private static int[] solution(int n, int[] arr) {
	  for(int i=1; i<n; i++) {
		  int num = arr[i], j;
		  for(j=i-1; j>=0; j--) {
			  if(num < arr[j]) {
				  arr[j+1] = arr[j];
			  } else break;
		  }
		  arr[j+1] = num;
	  }
	  return arr;
  }
}