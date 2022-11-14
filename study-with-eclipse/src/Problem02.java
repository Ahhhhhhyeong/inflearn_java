import java.util.Scanner;
  
public class Problem02 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    
    String result = "";
    for(char c : str.toCharArray()) {
    	if(Character.isLowerCase(c)) result += Character.toUpperCase(c);
    	else result += Character.toLowerCase(c);
    }
    System.out.println(result);
    return ;
  }
}