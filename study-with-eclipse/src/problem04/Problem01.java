package problem04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem01 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    String str = in.next();
    
    System.out.println(solution(n, str));
    
    return ;
  }
  
  public static char solution(int n, String str) {
	  HashMap<Character, Integer> hs = new HashMap();
	  
	  for(char c : str.toCharArray()) {
		  hs.put(c, hs.getOrDefault(c,0)+1);
	  }
	  
	  int max=0;
	  char result = 0;
	  
	  for(Map.Entry<Character, Integer> s : hs.entrySet()) {
		  if(s.getValue() > max) {
			  max = s.getValue();
			  result = s.getKey();
		  }
	  }
	  
	  return result;
  }
}