/**
 * 봉우리
 */
import java.util.Scanner;
  
public class Problem22 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[][] arr = new int[n+2][n+2];    
    for(int i=1; i<=n; i++) { // 봉우리 높이 배열 받기
    	for(int j=1; j<=n; j++) {
    		arr[i][j] = in.nextInt();
    	}
    }    
    System.out.println(solution(n, arr));        
    return ;
  }
  
  public static int solution(int n, int[][] arr) {
	  int cnt = 0;
	  
	  for(int i=1; i<=n; i++) {
		  for(int j=1; j<=n; j++) {
			  if(arr[i][j] > arr[i][j-1] && 
				 arr[i][j] > arr[i][j+1] && 
				 arr[i][j] > arr[i-1][j] && 
				 arr[i][j] > arr[i+1][j]) {
				  cnt++;
			}
		  }
	  }	  
	  return cnt;
  }
}