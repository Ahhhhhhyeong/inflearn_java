package problem08;
/**
 * 최대 점수 구하기(DFS)
 */
import java.util.*;

public class Problem03 {
	static int answer=Integer.MIN_VALUE, m, n;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    n = in.nextInt(); 
	    m = in.nextInt(); 
	    int[] time_arr = new int[n];
	    int[] score_arr = new int[n];
	    for(int i=0; i<n; i++) {
	    	score_arr[i] = in.nextInt();
	    	time_arr[i] = in.nextInt();
	    }
	    
	    DFS(0,0,0,time_arr,score_arr);
	    System.out.println(answer);
	    return ;
	}

	private static void DFS(int L, int time, int score, int[] time_arr, int[] score_arr) {
		if(time>m) return;
		if(L==n) {
			answer = Math.max(answer, score);
		}
		else {
			DFS(L+1, time+time_arr[L], score+score_arr[L], time_arr, score_arr);
			DFS(L+1, time, score, time_arr, score_arr);
		}		
	}

}
