import java.util.Scanner;
  
public class Problem11 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(solution(str));
    return ;
  }
  
  public static String solution(String str) {
	  String result = "";
	  int cnt = 1;
	  str = str + " ";
	  for(int i=0; i<str.length()-1;i++) {
		  if(str.charAt(i) == str.charAt(i+1)) cnt++;
		  else {
			  result += str.charAt(i);
			  if(cnt > 1)  result += String.valueOf(cnt);
			  cnt = 1;
		  }
	  }
	  	  
	  return result;
  }
}