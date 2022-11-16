package problem05;

import java.util.*;

public class Problem04 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(solution(str));
    return ;
  }
  
  public static int solution(String str) {
	  Stack<Integer> stack = new Stack<>();
	   
	  for(char x : str.toCharArray()) {
		  //.getNumbericValue
		  if(Character.isDigit(x)) stack.push(Character.getNumericValue(x));
		  else {
			int rt = stack.pop();
			int lt = stack.pop();
			if(x=='+') stack.push(lt + rt);
			else if(x=='-') stack.push(lt - rt);
			else if(x=='*') stack.push(lt * rt);
			else if(x=='/') stack.push(lt / rt);
		  }
	  }
	  
	  return stack.pop();
  }
}