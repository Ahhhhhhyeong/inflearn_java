package chapter05;

import java.util.*;

public class Problem01 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(solution(str));
    return ;
  }
  
  public static String solution(String str) {
	  String result = "YES";
	  Stack<Character> stk = new Stack<>();
	  for(char x : str.toCharArray()) {
		  if(x=='(') stk.push(x);
		  else {
			  if(stk.isEmpty()) return "NO";
			  stk.pop();
		  }
	  }
	  if(!stk.isEmpty()) return "NO";
	  return result;
  }
}