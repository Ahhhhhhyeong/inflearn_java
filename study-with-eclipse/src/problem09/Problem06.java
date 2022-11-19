package problem09;
/**
 * 
 * 친구인가? Disjoint-Set : Union&Find)
 * - Disjoint-Set=서로소
 *
 */
import java.util.*;

public class Problem06 {
	static int[] unf;
	public static int find(int a) {
		if(a == unf[a]) return a;
		else return unf[a] = find(unf[a]);
	}
	
	public static void union(int a, int b) {
		int fa = find(a);
		int fb = find(b);
		if(fa != fb) unf[fa] = fb;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		unf = new int[n+1];
		for(int i=1; i<=n; i++)unf[i] = i; // 학생 번호별 집합
		for(int i=0; i<m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			union(a, b);
		}
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(find(x) == find(y)) System.out.println("YES");
		else System.out.println("NO");
	}

}
