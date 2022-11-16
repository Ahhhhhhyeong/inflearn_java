package problem04;

import java.util.*;

public class Problem04 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String s = in.next();
    String t = in.next();
    solution(s, t);
    return ;
  }
  
  public static void solution(String s, String t) {
	  int result = 0;
	  HashMap<Character, Integer> hm1 = new HashMap<>();
	  HashMap<Character, Integer> hm2 = new HashMap<>();
	  for(int i=0; i<t.length()-1; i++) hm1.put(s.toCharArray()[i], hm1.getOrDefault(s.toCharArray()[i], 0)+1);
	  for(char x : t.toCharArray()) hm2.put(x, hm2.getOrDefault(x, 0)+1);
	  int lt = 0;
	  for(int i=t.length()-1; i<s.length(); i++) {
		  hm1.put(s.toCharArray()[i], hm1.getOrDefault(s.toCharArray()[i], 0)+1);
		  if(hm2.equals(hm1)) result++;
		  hm1.put(s.toCharArray()[lt], hm1.get(s.toCharArray()[lt])-1);		  
		  if(hm1.get(s.toCharArray()[lt]) == 0)hm1.remove(s.toCharArray()[lt]);
		  lt++;
	  }
	  System.out.println(result);
  }
}