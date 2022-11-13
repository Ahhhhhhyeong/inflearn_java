/**
 *
 * 이진수 출력(재귀)
 *
 */
class DFS2{
	public static void main(String[] args) {
		DFS(11);
	}
	
	public static void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n/2);
			System.out.printf("%d ", n%2);
		}
	}
	
}