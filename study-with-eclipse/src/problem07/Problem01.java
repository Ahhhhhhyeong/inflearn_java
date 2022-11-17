package problem07;
/**
 * 재귀함수(스택프레임)
 * - 자기 자신을 부르는 함수
 * - 스택프레임 안에-> 매개변수, 지역변수, 복귀주소
 */

public class Problem01 {
	public static void DFS(int n) { 
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		DFS(3);		
	}

}
