package problem07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * 이진트리 순회(BFS 넓이우선탐색: 레벨탐색)
 *
 */
class Location {
	int data;
	Location lt,  rt;
	public Location(int val) {
		data = val;
		lt = rt = null;
	}
}
public class Problem07 {
	static Location root;
	public static void BFS(Location root) {
		Queue<Location> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			for(int i=0; i<len; i++) {
				Location cur = Q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		root = new Location(1);
		root.lt = new Location(2);
		root.rt = new Location(3);
		root.lt.lt = new Location(4);
		root.lt.rt = new Location(5);
		root.rt.lt = new Location(6);
		root.rt.rt = new Location(7);
		BFS(root);

	}

}
