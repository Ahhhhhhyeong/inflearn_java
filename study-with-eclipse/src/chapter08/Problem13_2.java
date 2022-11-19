package chapter08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * 섬나라 아일랜드(BFS)
 *
 */
class Point2{
	int x, y;
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}
public class Problem13_2 {
	static int[] dx = {-1,0,1,0,-1,1,-1,1};
	static int[] dy = {0,1,0,-1,-1,-1,1,1};
	static int n;
	static int result=0;
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    n = in.nextInt();
	    int[][] arr = new int[n][n];
	    for(int i=0; i<n; i++) {
	    	for(int j=0; j<n; j++) {
	    		arr[i][j] = in.nextInt();
	    	}
	    }
	    solution(arr);
	    System.out.println(result);
	    return ;
	}

	private static void solution(int[][] arr) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==1) {
					result++;
					arr[i][j] = 0;
					BFS(i, j, arr);
				}
			}
		}
	}

	private static void BFS(int x, int y, int[][] arr) {
		Queue<Point2> Q = new LinkedList<>();
		Q.add(new Point2(x, y));
		while(!Q.isEmpty()) {
			Point2 pos = Q.poll();
			for(int i=0; i<8; i++) {
				int nx = pos.x + dx[i];
				int ny = pos.y + dy[i];
				if(nx>=0 && ny>=0 && nx<n && ny<n && arr[nx][ny] == 1) {
					arr[nx][ny] = 0;
					Q.add(new Point2(nx, ny));
				}
			}
		}
	}
	

}
