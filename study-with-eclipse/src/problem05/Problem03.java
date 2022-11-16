package problem05;
/**
 * ũ���� �����̱�
 */
import java.util.*;

public class Problem03 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt(); // ������ n*n
    int[][] board = new int[n][n]; // ������
    for(int i=0; i<n; i++) {
    	for(int j=0; j<n; j++) {
    		board[i][j] = in.nextInt();
    	}
    }
    int m = in.nextInt(); // �̱�Ƚ��
    int[] move = new int[m];
    for(int i=0; i<m; i++) move[i] = in.nextInt();
    solution(n, board, m, move);
    return ;
  }
  
  public static void solution(int n, int[][] board, int m, int[] move) {
	  Stack<Integer> stk = new Stack<>();
	  int result = 0;
	  
	  for(int i=0; i<m; i++) { // ũ���� �̵�Ƚ��
		  for(int j=0; j<n; j++) { // �� Ž��
			  if(board[j][move[i]-1] != 0) { //����(����)�� ������ ��
				  if(!stk.empty() && stk.peek() == board[j][move[i]-1]) {//�ֻ�ܿ� ���� ����(����)�� ������ ��
					  result++; //������ �����ϴ� Ƚ�� ����
					  stk.pop(); //��������
					  board[j][move[i]-1] = 0;
					  break;
				  } else { // �׿��� ��� ������ stack�� �־���
					  stk.push(board[j][move[i]-1]);
					  board[j][move[i]-1] = 0;
					  break;
				  }
			  }
		  }
	  }
	  
	  System.out.println(result*2);
  }
}