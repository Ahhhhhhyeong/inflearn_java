/**
 * �Ҽ�(�����佺�׳׽� ü)
 */

import java.util.Scanner;
  
public class Problem17 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    
    int[] arr = new int[num+1];
    int cnt = 0;    
    for(int i = 2; i<=num; i++) {
    	if(arr[i]==0) {
    		cnt++;
    		for(int j=i; j<=num; j=j+i) arr[j] = i;
    	}
    }
    
    System.out.println(cnt);

    return ;
  }

}