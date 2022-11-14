import java.util.Scanner;
  
public class Problem06 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(solution(str));
    return ;
  }
  
  public static String solution(String str) {
	  String result = "";	  
	  for(int i=0; i<str.length(); i++) {	
		  if(i == str.indexOf(str.charAt(i))) {
			  result += str.charAt(i);
		  }
	  }	 	  
	  return result;
  }
}