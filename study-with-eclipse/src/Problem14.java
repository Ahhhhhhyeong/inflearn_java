import java.util.Scanner;
  
public class Problem14 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    int[] arr = new int[num];
    for(int i=0; i<num; i++) {
    	arr[i] = in.nextInt();
    }
    
    int result = 1;
    int max = arr[0];
    for(int i=1; i<num; i++) {
    	if(max < arr[i]) {
    		result++;
    		max = arr[i];
    	}
    }
    System.out.println(result);
    return ;
  }
}