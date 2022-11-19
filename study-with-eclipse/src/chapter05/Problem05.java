package chapter05;

import java.util.*;

public class Problem05 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(solution(str));
    return ;
  }
  
  public static int solution(String str) {
	  Stack<Character> stack = new Stack<>();
	  int result = 0;
	  for(int i=0; i<str.length(); i++) {
		  if(str.charAt(i) == '(') stack.push('(');	// 여는괄호는 무조건 push
		  else { // 닫는 괄호인경우
			  stack.pop(); // 괄호의 짝 pop시켜줌
			  if(str.charAt(i-1) == '(') result += stack.size();	// 이전괄호가 여는괄호일때는 레이저를 쏘는 경우, 사이즈만큼 더해준다
			  else result++; // 이전 괄호가 닫는 괄호일때 막대크기를 나타내는거이기에 +1만 해준다
		  }
	  }  
	  
	  return result;
  }
}