import java.util.Scanner;
  
public class Problem03 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    
    System.out.println(solved(str));
    return ;
  }
  
  public static String solved(String str) {
	  String[] arr = str.split(" ");
	  String result = arr[0];
	  for(int i=0; i<arr.length; i++) {
		  if(result.length() < arr[i].length()) result = arr[i];		  
	  }
	  
	  return result;
  }
  
}