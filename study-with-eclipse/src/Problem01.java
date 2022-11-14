import java.util.Scanner;
  
public class Problem01 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.nextLine().toUpperCase();
    String chr = in.next().toUpperCase();
    
    int cnt = 0;
    for(char x : str.toCharArray()) {
    	if(chr.charAt(0) == x) cnt++;
    }
    System.out.println(cnt);
    return ;
  }
}