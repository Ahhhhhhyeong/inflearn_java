package problem05;

import java.util.*;

public class Problem07 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next();
    String hclass = in.next();
    System.out.println(Solution(str, hclass));
    return ;
  }
  
  private static String Solution(String subject, String hclass) {
	  String result = "YES";
	  Queue<Character> que = new LinkedList<>();
	  for(char x : hclass.toCharArray()) que.offer(x);
	  
	  for(char x : subject.toCharArray()) {
		  while(!que.isEmpty()) {
			  char tmp = que.poll();
			  if(tmp == x) {
				  result = "YES";
				  break;
			  }
			  result = "NO";
		  }
	  }	  
	  return result;		
  }
}