package chapter07;
/**
 * 
 * Tree ���ܳ������� ���� ª�� ���(DFS)
 * - ��尡 ���ʸ�������� DFS�� Ǯ �� ����
 * 
 */
class Node2 {
	int data;
	Node2 lt, rt;
	public Node2(int val) {
		data = val;
		lt = rt = null;
	}
}
public class Problem09 {
	static Node2 root;
	public static int DFS(int L, Node2 root) {
		if(root.lt==null && root.rt==null) return L;
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));		
	}
	public static void main(String[] args) {
		root = new Node2(1);
		root.lt = new Node2(2);
		root.rt = new Node2(3);
		root.lt.lt = new Node2(4);
		root.lt.rt = new Node2(5);
		System.out.println(DFS(0, root));

	}

}
