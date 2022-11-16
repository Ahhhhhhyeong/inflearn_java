package problem05;

import java.util.*;

public class Problem02 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(solution(str));
    return ;
  }
  
  public static String solution(String str) {
	  String result = "";
	  Stack<Character> stk = new Stack<>();
	  
	  for(char x : str.toCharArray()) {
		  if(x == ')') {
			  while(stk.pop() != '(');
		  }
		  else {
			  stk.push(x);
		  }
	  }
	  for(int i=0; i<stk.size(); i++) {
		  result += stk.get(i);
	  }	  
	  return result;
  }
}