import java.util.Scanner;
  
public class Problem07 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next().toLowerCase();
    String result = "YES";
    
    char[] arr = str.toCharArray();
    int i = arr.length - 1;    
    for(char x : str.toCharArray()) {
    	if(x != arr[i]) result ="NO";
    	i--;
    }
    
    System.out.println(result);
    return ;
  }
}