package problem09;
/**
 * 
 * �������� (ũ�罺Į: Union & Find)
 *
 */
import java.util.*;

class Edge2 implements Comparable<Edge2>{
	public int v1;
	public int v2;
	public int cost;
	Edge2(int v1, int v2, int cost){
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge2 o) {
		return this.cost-o.cost;
	}
}

public class Problem07 {
	static int[] unf;
	
	public static int Find(int a) {
		if(a == unf[a]) return a;
		else return unf[a] = Find(unf[a]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) unf[fa] = fb;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int v = in.nextInt();
		int e = in.nextInt();
		unf = new int[v+1];
		ArrayList<Edge2> arr = new ArrayList<>();
		for(int i=1; i<=v; i++) unf[i]=i;
		for(int i=0; i<e; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			arr.add(new Edge2(a, b, c));
		}
		int answer =0, cnt=0;
		Collections.sort(arr);
		for(Edge2 ob : arr) {
			int fv1=Find(ob.v1);
			int fv2=Find(ob.v2);
			if(cnt == v-1) break;
			if(fv1 != fv2) { 
				answer+=ob.cost;
				cnt++;
				Union(ob.v1, ob.v2);
			}
		}
		System.out.println(answer);
	}

}
