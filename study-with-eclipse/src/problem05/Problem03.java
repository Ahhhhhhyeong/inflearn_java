package problem05;
/**
 * 크레인 인형뽑기
 */
import java.util.*;

public class Problem03 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt(); // 게임판 n*n
    int[][] board = new int[n][n]; // 게임판
    for(int i=0; i<n; i++) {
    	for(int j=0; j<n; j++) {
    		board[i][j] = in.nextInt();
    	}
    }
    int m = in.nextInt(); // 뽑기횟수
    int[] move = new int[m];
    for(int i=0; i<m; i++) move[i] = in.nextInt();
    solution(n, board, m, move);
    return ;
  }
  
  public static void solution(int n, int[][] board, int m, int[] move) {
	  Stack<Integer> stk = new Stack<>();
	  int result = 0;
	  
	  for(int i=0; i<m; i++) { // 크레인 이동횟수
		  for(int j=0; j<n; j++) { // 행 탐색
			  if(board[j][move[i]-1] != 0) { //숫자(인형)이 존재할 때
				  if(!stk.empty() && stk.peek() == board[j][move[i]-1]) {//최상단에 같은 숫자(인형)이 존재할 때
					  result++; //인형들 제거하는 횟수 증가
					  stk.pop(); //인형제거
					  board[j][move[i]-1] = 0;
					  break;
				  } else { // 그외의 경우 인형을 stack에 넣어줌
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