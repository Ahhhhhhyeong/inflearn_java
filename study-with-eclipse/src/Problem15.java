/**
 * 
 * 
 * 가위바위보
 * 
 */
import java.util.Scanner;
  
public class Problem15 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    int[] a = new int[num];
    int[] b = new int[num];
    
    for(int i=0; i<2; i++) {
    	for(int j=0; j<num; j++) {
    		if(i==0) a[j] = in.nextInt();
    		else b[j] = in.nextInt();
    	}
    }
    
    solution(a, b, num);
    
    return ;
  }
  
  public static void solution(int[] a, int[] b, int num) {
	  for(int i=0; i<num; i++) {
		  if(a[i] == b[i]) System.out.println("D");
		  else if(a[i] == 1) {
			  if(b[i] == 2) System.out.println("B");
			  if(b[i] == 3) System.out.println("A");
		  }
		  else if(a[i] == 2) {
			  if(b[i] == 1) System.out.println("A");
			  if(b[i] == 3) System.out.println("B");
		  }
		  else if(a[i] == 3) {
			  if(b[i] == 1) System.out.println("B");
			  if(b[i] == 2) System.out.println("A");
		  }
	  }
	  
  }
}