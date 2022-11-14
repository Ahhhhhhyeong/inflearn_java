import java.util.Scanner;
  
public class Problem12 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    String str = in.next();
    
    String answer = "";
    for(int i=0; i<num; i++) {
    	answer += solution(str.substring(i*7, i*7+7));
    }
    
    System.out.println(answer);
    
    return ;
  }
  
  public static String solution(String str) {
	  String result = "";
	  str = str.replace('#', '1').replace('*', '0');
	  int num = Integer.parseInt(str, 2);
	  result += (char)num;
	  return result;
  }
}




