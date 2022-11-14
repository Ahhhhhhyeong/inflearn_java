import java.util.Scanner;
  
public class Problem04 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    for(int i=1; i<=num; i++) {
    	String[] arr = in.next().split("");
    	for(int j=arr.length-1; j>=0; j--) {
    		System.out.printf("%s", arr[j]);
    	}
    	System.out.printf("\n");
    }
    
    return ;
  }
}