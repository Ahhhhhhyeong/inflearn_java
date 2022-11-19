package chapter07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * 송아지 찾기(BFS: 상태트리탐색)
 *
 */

public class Problem08 {
	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	public int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1;
		Q.offer(s);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				int num = Q.poll();
				for(int j=0; j<dis.length; j++) {
					int tmp = num + dis[j];
					if(tmp == e) return L + 1;
					if(ch[tmp] != 1 && tmp > 0) {
						ch[tmp] = 1;
						Q.offer(tmp);
					}						
				}
			}
			L++;
		}
		return L;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);	
		Problem08 T = new Problem08();
		int s = in.nextInt();
	    int e = in.nextInt();
	    System.out.println(T.BFS(s,e));
	    return ;
	}

}
