package chapter03;
/**
 * 공통원소 구하기
 */
import java.util.*;

public class Problem02 {
	  public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    int[] p1 = new int[n];
	    for(int i=0; i<n; i++) {
	    	p1[i] = in.nextInt();
	    }
	    int m = in.nextInt();
	    int[] p2 = new int[m];
	    for(int i=0; i<m; i++) {
	    	p2[i] = in.nextInt();
	    }
	    for(int x : solution(n, m, p1, p2) ) if(x != 0) System.out.printf("%d ", x);
	    return ;
	  }
	  
	  public static ArrayList<Integer> solution(int n, int m, int[] p1, int[] p2) {
		  ArrayList<Integer> result = new ArrayList<>();
		  Arrays.sort(p1);
		  Arrays.sort(p2);
		  int a=0, b=0;
		  while(a<n && b<m) {
			  if(p1[a] == p2[b]) {
				  result.add(p1[a++]);
				  b++;
			  }
			  else if(p1[a] < p2[b]) a++;
			  else b++;
		  }		  
		  return result;
	  }
	}