package chapter08;
/**
 * 섬나라 아일랜드(DFS)
 */
import java.util.*;

public class Problem13 {
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
					DFS(i, j, arr);
				}
			}
		}
	}
	
	private static void DFS(int x, int y, int[][] board) {
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && ny>=0 && nx<n && ny<n && board[nx][ny]==1) {
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
	}

}
