/**
 * 등수 구하기
 */

import java.util.Scanner;
  
public class Problem20 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int[] score = new int[n];
    for(int i=0; i<n; i++) { //점수받아오기
    	score[i] = in.nextInt();
    }
    
    for(int i=0; i<n; i++) {
    	int cnt = 1;
    	for(int j=n-1; j>=0; j--) {
    		 if(score[i] < score[j]) cnt++;
    	}
    	System.out.printf("%d ", cnt);
    }  
    return ;
  }
}