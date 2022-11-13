/**
 * 재귀함수 기본
 */

import java.util.*;

class Main{
	public static void DFS(int n) { //재귀함수는 스택 프레임을 사용
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.print(n + " "); 	//POP
		}
	}
	
	public static void main(String[] args) {
		DFS(3); //-#print:  1 2 3
	}
}