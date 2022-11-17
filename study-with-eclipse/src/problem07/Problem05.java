package problem07;
/**
 * 
 * ����Ʈ����ȸ(DFS: Depth-First Search)
 * - ������ȸ, ������ȸ ����
 * - ������ ���� 7-5 ����
 * - ���� : �� - �� - ��  => ���� ��ȸ  
 * - ���� : �� - �� - ��  => ������ȸ 
 * - ���� : �� - �� - �� => ������ȸ
 *
 */
class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}
public class Problem05 {
	static Node root;
	public static void DFS(Node root) {
		if(root==null) return;
		else { //2�� ����ߵ�
			//System.out.print(root.data + " "); // ������ȸ
			DFS(root.lt);
			//System.out.print(root.data + " "); // ������ȸ
			DFS(root.rt);
			//System.out.print(root.data + " "); // ������ȸ
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
		DFS(root);
	}

}
