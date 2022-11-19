package problem08;

import java.util.*;

class Point{
	public int x, y;
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
}

public class Problem11 {
	static int[] dx = {-1, 0, 1, 0}; // 12시방향, 6시방향
	static int[] dy = {0, 1, 0, -1}; // 3시방향, 9시방향
	static int[][] board = new int[8][8];
	static int[][] dis = new int[8][8];
	
	public static void main(String[] args) {
		Problem11 T = new Problem11();
		Scanner in = new Scanner(System.in);
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				board[i][j] = in.nextInt();
			}
		}
		T.BFS(1, 1);
		if(dis[7][7]==0) System.out.println(-1); // 도착할 수 없으면 -1
		else System.out.println(dis[7][7]);	// 도착했을 때
	}

	private void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		board[x][y] = 1; //출발점
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0) {
					board[nx][ny]=1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y]+1;
				}
			}
		}		
	}

}
