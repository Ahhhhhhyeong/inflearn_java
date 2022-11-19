package problem08;

import java.util.*;
/**
 * 
 * 피자 배달 거리(DFS활용)
 *
 */
class Point3{
	int x, y;
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Problem14 {
	static ArrayList<Point3> hs, pz;
	static int n, m, len;
	static int result = Integer.MAX_VALUE;
	static int[] combi;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int num = in.nextInt();
				if(num == 1) hs.add(new Point3(i, j));
				if(num == 2) pz.add(new Point3(i, j));
			}
		}
		len = pz.size();
		combi = new int[m];
		DFS(0, 0);
		System.out.println(result);
	}

	private static void DFS(int L, int start) {
		if(L==m) {
			int sum = 0;
			for(Point3 h : hs) {
				int dis=Integer.MAX_VALUE;
				for(int i : combi) {
					dis=Math.min(dis, Math.abs((h.x-pz.get(i).x)) + Math.abs((h.y-pz.get(i).y)));
				}
				sum += dis;
			}
			result = Math.min(result, sum);
		} else {
			for(int i=start; i<len; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}

}
