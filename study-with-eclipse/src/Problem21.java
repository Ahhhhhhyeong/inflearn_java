/**
 * 격자판 최대합
 */
import java.util.Scanner;
  
public class Problem21 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    
    int[][] arr = new int[n][n];
    for(int i=0; i<n; i++) { // 2차원 배열에 값 넣기
    	for(int j=0; j<n; j++) {
    		arr[i][j] = in.nextInt();
    	}
    }
    int max = vertical(arr, n);
    if(max < diagonal(arr, n)) max = diagonal(arr,n);
    
    System.out.println(max);
    return ;
  }
  
  public static int vertical(int[][] arr, int n) {
	  int ver_max = 0;
	  for(int i=0; i<n; i++) { // 2차원 배열에 값 넣기
		int sum1 = 0, sum2=0;
	    for(int j=0; j<n; j++) {
	    	sum1 += arr[i][j];
	    	sum2 += arr[j][i];
	    }
	    if(ver_max < sum1) ver_max = sum1;
	    else if(ver_max < sum2) ver_max = sum2;
	   }
	  
	  return ver_max;
  }
  
  
  public static int diagonal(int[][] arr, int n) {
	  int lt_cnt =0, rt_cnt=0;
	  for(int i=0; i<n; i++) {
		  lt_cnt += arr[i][i]; 
	  }
	  for(int j=n-1; j<=0; j--) {
		  rt_cnt += arr[j][j];
	  }
	  if(lt_cnt > rt_cnt) return lt_cnt;
	  return rt_cnt;
  }
  
}