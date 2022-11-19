package chapter04;
/**
 * K��° ū ��
 */
import java.util.*;

public class Problem05 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
    	arr[i] = in.nextInt();
    }
    solution(n, k, arr);
    return ;
  }
  // treeset : �ߺ�����, �ڵ�����
  public static void solution(int n, int k, int[] arr) {
	  int result = -1;
	  TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //�������� ����
	  for(int i=0; i<n; i++) {
		  for(int j=i+1; j<n; j++) {
			  for(int l=j+1; l<n; l++) {
				  Tset.add(arr[i] + arr[j] + arr[l]);
			  }
		  }
	  }
	  int cnt = 0;
	  for(int x : Tset) {
		  cnt++;
		  if(cnt == k) result = x;
	  }
	  System.out.println(result);
  }
}