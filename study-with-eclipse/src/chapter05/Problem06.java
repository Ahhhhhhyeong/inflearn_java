package chapter05;
/**
 * 공주 구하기
 */
import java.util.*;

public class Problem06 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    System.out.println(solution(n, k));
    return ;
  }
  
  private static int solution(int n, int k) {
	int result = 0;
	Queue<Integer> que = new LinkedList<>();
	for(int i=1; i<=n; i++) {
		que.offer(i);
	}
	while(!que.isEmpty()) {
		for(int i=1; i<k; i++) que.offer(que.poll());
		que.poll();
		if(que.size() == 1) result = que.poll();
	}	
	return result;
  }


}