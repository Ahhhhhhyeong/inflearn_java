package chapter04;

import java.util.*;

public class Problem02 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String a = in.next();
    String b = in.next();
    System.out.println(solution(a, b));
    return ;
  }
  
  public static String solution(String a, String b) {
	  HashMap<Character, Integer> map1 = new HashMap<>();
	  HashMap<Character, Integer> map2 = new HashMap<>();
	  for(char c : a.toCharArray()) {
		  map1.put(c, map1.getOrDefault(c, 0) + 1);
	  }
	  for(char c : b.toCharArray()) {
		  map2.put(c, map2.getOrDefault(c, 0) + 1);
	  }
	  
	  if(map1.equals(map2)) {
		  return "YES";
	  }else {
		  return "NO";
	  }
  }
}