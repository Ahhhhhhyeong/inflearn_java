package chapter09;

import java.util.*;

class Body implements Comparable<Body>{
	int w, h;
	Body(int h, int w){
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Body o) {
		return o.h - this.h;
	}
}

public class Problem01 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Body> player = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int h = in.nextInt();
			int w = in.nextInt();
			player.add(new Body(h, w));
		}
		System.out.println(new Problem01().solution(player, n));

	}

	private int solution(ArrayList<Body> player, int n) {
		int cnt = 0;
		Collections.sort(player);
		int max = Integer.MIN_VALUE;
		
		for(Body w : player) {
			if(max < w.w) {
				max = w.w;
				cnt++;
			}
		}
		return cnt;
	}

}
