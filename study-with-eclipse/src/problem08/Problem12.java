package problem08;

import java.util.*;

/**
 * 
 * 토마토 익는 날짜구하기 (BFS활용)
 *
 */
class Pointer{
	int x,y;
	Pointer(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Problem12 {
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	static int n, m;
	static int[][] box, dis;
	static Queue<Pointer> Q =new LinkedList<>();
	
	public static void main(String[] args) {
		Problem12 T = new Problem12();
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt(); // 가로
		n = sc.nextInt(); // 세로
		box = new int[n][m];
		dis = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				box[i][j] = sc.nextInt();
				if(box[i][j] == 1) Q.offer(new Pointer(i, j));
			}
		}
		T.BFS();
		/*************박스에 익은 토마토 체크*****************/
		int answer = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(box[i][j] == 0) {
					System.out.println(-1);
					return;
				}
				answer = Math.max(answer, dis[i][j]);
			}
		}
		System.out.println(answer);
	}

	private void BFS() {
		while(!Q.isEmpty()) {
			Pointer tmp = Q.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=0 && ny>=0 && nx<n && ny<m && box[nx][ny]==0) {
					box[nx][ny] = 1;
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
					Q.offer(new Pointer(nx, ny));
				}
				
			}
		}
	}

}
