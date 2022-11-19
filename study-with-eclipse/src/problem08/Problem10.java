package problem08;
/**
 * �̷�Ž��(DFS)
 */
import java.util.Scanner;

public class Problem10 {
	static int[] dx = {-1, 0, 1, 0}; // 12�ù���, 6�ù���
	static int[] dy = {0, 1, 0, -1}; // 3�ù���, 9�ù���
	static int[][] board;
	static int answer=0;

	public static void main(String[] args) {
		Problem10 T = new Problem10();
		Scanner in = new Scanner(System.in);
		board = new int[8][8];
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				board[i][j] = in.nextInt();
			}
		}
		board[1][1] = 1;
		T.DFS(1, 1);
		System.out.println(answer);
	}

	private void DFS(int x, int y) {
		if(x==7 && y==7) answer++; // ��������
		else{
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0) {
					board[nx][ny]=1; // ���������� 1�� �ٲ���(�����Ѱ� �ٽ� �Ȱ��ڱ�)
					DFS(nx, ny);
					board[nx][ny]=0; // ���Ҷ� ������� ��������
				}
			}
		}
	}

}
