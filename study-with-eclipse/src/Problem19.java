/**
 * 점수계산
 */
import java.util.Scanner;
  
public class Problem19 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    int[] score = new int[num+1];
    
    for(int i=0; i<num; i++) {
    	score[i] = in.nextInt();
    	if(i>0 && score[i] >= 1 && score[i-1] >= 1) {
    		score[i] = score[i] + score[i-1];
    	}
    }
    
    int cnt = 0;
    for(int i=0; i<num; i++) {
    	if(score[i] >= 1) cnt+=score[i];    	
    }
    
    System.out.println(cnt);
    
    return ;
  }
}