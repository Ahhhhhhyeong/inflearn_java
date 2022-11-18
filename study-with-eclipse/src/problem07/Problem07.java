package problem07;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * 이진트리 순회(BFS 넓이우선탐색: 레벨탐색)
 *
 */
class Node {
	int data;
	Node lt,  rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}
public class Problem07 {
	static Node root;
	public static void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	public static void main(String[] args) {
		root = new Node(1);
		root.lt = new Node(2);
		root.rt = new Node(3);
		root.lt.lt = new Node(4);
		root.lt.rt = new Node(5);
		root.rt.lt = new Node(6);
		root.rt.rt = new Node(7);
		BFS(root);

	}

}
