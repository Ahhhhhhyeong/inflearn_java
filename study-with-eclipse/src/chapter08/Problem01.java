package chapter08;
/**
 * ���� ���� �κ�����(DFS: �Ƹ��� ���ͺ�)
 */
import java.util.*;

public class Problem01 {
	static String answer = "NO";
	static int total;
	static int[] arr;
	
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    arr =new int[n];
	    for(int i=0; i<n; i++) {
	    	arr[i] = in.nextInt();
	    	total += arr[i];
	    }
	    DFS(0,0);
	    System.out.println(answer);
	    return ;
	}
	
	public static void DFS(int level, int sum) {
		if(sum > total/2) return;
		if(answer == "YES") return;
		else {
			if(level == arr.length) {
				if((total - sum) == sum) answer="YES";
				return;
			}else {
				DFS(level+1, sum+arr[level]);
				DFS(level+1, sum);
			}
		}
	}

}
