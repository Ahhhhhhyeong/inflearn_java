package problem06;

import java.util.*;


class Point implements Comparable<Point>{
	public int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;		
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x==o.x) return this.y - o.y; //현재객체-새로온객체 => 오름차순
		else return this.x - o.x;
	}
}
public class Problem07 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		
		ArrayList<Point> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			arr.add(new Point(x, y));
		}
		Collections.sort(arr);
		for(Point o : arr) System.out.println(o.x + " " + o.y);
		
//		int[][] arr2 = new int[n][2];
//		for(int i = 0; i<n; i++) {
//			for(int j=0; j<2; j++) {
//				arr2[i][j] = in.nextInt();
//			}
//		}
//		solution(n, arr2);
	}
	
	private static void solution(int n, int[][] arr) {
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] == o2[0]) return o1[1] - o2[1];
				else return o1[0] - o2[0];
			}
		});
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}
}
