/**
 * ����Լ� �⺻
 */

import java.util.*;

class Main{
	public static void DFS(int n) { //����Լ��� ���� �������� ���
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