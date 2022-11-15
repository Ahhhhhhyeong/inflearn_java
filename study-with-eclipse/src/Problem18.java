/**
 * 뒤집은 소수
 */
import java.util.Scanner;
  
public class Problem18 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    
    for(int i=0; i<n; i++) {
    	int ch = in.nextInt();
    	int re = 0;
    	while(ch != 0) { // 숫자 뒤집기
    		re = re * 10 + ch %10;
    		ch /= 10;
    	}
    	if(checkNum(re) && re != 1) System.out.printf("%d ", re);
    }
    
    return ;
  }
  
  public static boolean checkNum(int n) { // 루트를 활용한 방법 -> i의 제곱값으로 체크함
	  for(int i=2; i*i<=n; i++) {
		  if(n%i == 0) return false;
	  }
	  return true;
  }
}