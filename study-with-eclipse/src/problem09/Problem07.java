package problem09;
/**
 * 
 * 원더랜드 (크루스칼: Union & Find)
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
			graph.get(a).add(new Land(b,c)); // 양방향이라 a경우랑 b경우 다 넣어줌
			graph.get(b).add(new Land(a,c));
		}	
		int answer = 0;
		PriorityQueue<Land> pQ = new PriorityQueue<>();
		pQ.offer(new Land(1, 0));
		while(!pQ.isEmpty()) {
			Land tmp = pQ.poll();
			int ev = tmp.vex; // 도착 정점
			if(ch[ev] == 0) { // 정점이 체크가 되어있지 않는 경우 
				ch[ev] = 1; // 체크!
				answer += tmp.cost; // 비용을 더해줌
				for(Land ob : graph.get(ev)) { // 연결된 정보 탐색
					// 연결된 정점이 있을 경우,
					// pQ에 정점과 비용을 넣어줌
					if(ch[ob.vex] == 0) pQ.offer(new Land(ob.vex, ob.cost)); 
				}
			}
		}		
		System.out.println(answer);
	}

}
