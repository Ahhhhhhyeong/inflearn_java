import java.util.Scanner;
  
public class Problem05 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    
    System.out.println(solution(str));
    
    return ;
  }
  
  public static String solution(String str) {
	  String result="";
	  char[] s = str.toCharArray();
	  int lt=0, rt=str.length()-1;
	  while(lt<rt) {
		  if(!Character.isAlphabetic(s[lt])) lt++;
		  else if(!Character.isAlphabetic(s[rt])) rt--;
		  else {
			  char tmp = s[lt];
			  s[lt] = s[rt];
			  s[rt] = tmp;
			  lt++;
			  rt--;
		  }
	  }
	  result = String.valueOf(s);
	  
	  return result;	  
  }
}