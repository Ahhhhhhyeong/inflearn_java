package problem09;
/**
 * 
 * �������� (ũ�罺Į: Union & Find)
 *
 */
import java.util.*;
class Land implements Comparable<Land>{
	public int vex;
	public int cost;
	Land(int vex, int cost){
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Land o) {
		return this.cost-o.cost;
	}
}

public class Problem07 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int e = in.nextInt();
		ArrayList<ArrayList<Land>> graph = new ArrayList<ArrayList<Land>>();
		for(int i=0; i<=v; i++) {
			graph.add(new ArrayList<Land>());
		}
		int[] ch = new int[v+1];
		for(int i=0; i<e; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			graph.get(a).add(new Land(b,c)); // ������̶� a���� b��� �� �־���
			graph.get(b).add(new Land(a,c));
		}	
		int answer = 0;
		PriorityQueue<Land> pQ = new PriorityQueue<>();
		pQ.offer(new Land(1, 0));
		while(!pQ.isEmpty()) {
			Land tmp = pQ.poll();
			int ev = tmp.vex; // ���� ����
			if(ch[ev] == 0) { // ������ üũ�� �Ǿ����� �ʴ� ��� 
				ch[ev] = 1; // üũ!
				answer += tmp.cost; // ����� ������
				for(Land ob : graph.get(ev)) { // ����� ���� Ž��
					// ����� ������ ���� ���,
					// pQ�� ������ ����� �־���
					if(ch[ob.vex] == 0) pQ.offer(new Land(ob.vex, ob.cost)); 
				}
			}
		}		
		System.out.println(answer);
	}

}
