package problem07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * 그래프 최단거리(BFS)
 *
 */
public class Problem14 {
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public static void BFS(int v) {
		Queue<Integer> Q = new LinkedList<>();
		ch[v] = 1;
		dis[v]=0;
		Q.offer(v);
		while(!Q.isEmpty()) {
			int cv = Q.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv]==0) {
					ch[nv] = 1;
					Q.offer(nv);
					dis[nv]=dis[cv]=1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch=new int[n+1];
		dis=new int[n+1];
		for(int i=0; i<m; i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			graph.get(a).add(b);
		}
		ch[1]=1;
		BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i + " : "+ dis[i]);
		}

	}

}
