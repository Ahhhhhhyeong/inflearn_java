package chapter10;
/**
 * 
 * 가장 높은 탑 쌓기(LIS) 
 *
 */

import java.util.*;

class Brick implements Comparable<Brick>{
	public int s;
	public int h;
	public int w;
	Brick(int s, int h, int w){
		this.s=s;
		this.h=h;
		this.w=w;
	}
	@Override
	public int compareTo(Brick o) {
		return o.s-this.s;
	}
}

public class Problem04 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Brick> arr = new ArrayList<>();		
		for(int i=0; i<n; i++) {
			int s = in.nextInt();
			int h = in.nextInt();
			int w = in.nextInt();
			arr.add(new Brick(s, h, w));
		}
		System.out.println(new Problem04().solution(n, arr));
	}

	private int solution(int n, ArrayList<Brick> arr) {
		int sum = 0;
		Collections.sort(arr);
		int[] dy = new int[n]; 
		dy[0] = arr.get(0).h;
		sum = dy[0];
		for(int i=1; i<n; i++) {
			int max_h=0;
			for(int j=i-1; j>=0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j]>max_h) {
					max_h=dy[j];
				}
			}
			dy[i] = max_h+arr.get(i).h;
			sum = Math.max(sum, dy[i]);
		}
		return sum;
	}

}
