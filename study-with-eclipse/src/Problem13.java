import java.util.Scanner;
  
public class Problem13 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    
    int[] arr = new int[num];
    for(int i=0; i<num; i++) {
    	arr[i] = in.nextInt();
    }
    
    for(int i=0; i<num; i++) {
    	if(i == 0) System.out.printf("%d ", arr[i]);
    	else if(arr[i-1] < arr[i]) System.out.printf("%d ", arr[i]);	   	
    }
    
    return ;
  }
}