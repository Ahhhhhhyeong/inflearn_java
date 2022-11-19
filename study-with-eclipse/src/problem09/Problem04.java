package problem09;

import java.util.*;

class Lecture implements Comparable<Lecture>{
	int m, d;
	Lecture(int m, int d){
		this.m = m;
		this.d = d;
	}
	@Override
	public int compareTo(Lecture o) {
		if(o.d==this.d) return o.m-this.m;
		else return o.d-this.d;
	}
	
}
public class Problem04 {
	static int n, max =0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    n = in.nextInt();
	    ArrayList<Lecture> arr = new ArrayList<>();
	    for(int i=0; i<n; i++) {
	    	int money = in.nextInt();
	    	int time = in.nextInt();
	    	arr.add(new Lecture(money, time));
	    	if(time>max) max = time;
	    }
	    solution(arr);
	    return ;
	}

	private static void solution(ArrayList<Lecture> arr) {
		int result = 0;
		PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder()); //큰값을 우선순위로
		Collections.sort(arr);
		int j=0;
		for(int i=max; i>=1; i--) {
			for( ; j<n; j++) {
				if(arr.get(j).d<i) break;
				que.offer(arr.get(j).m);
			}
			if(!que.isEmpty()) result += que.poll();
		}
		System.out.println(result);
	}

}
