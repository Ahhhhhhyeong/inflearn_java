package chapter05;

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
  
  private static String Solution2(String need, String plan) { // 인프런 강의 풀이
	  String answer = "YES";
	  Queue<Character> que = new LinkedList<>();
	  for(char x : need.toCharArray()) que.offer(x);
	  for(char x : plan.toCharArray()) {
		  if(que.contains(x)) {
			  if(x!=que.poll()) return "NO";
		  }
	  }
	  if(!que.isEmpty()) return "NO";	  
	  return answer;
  }
}