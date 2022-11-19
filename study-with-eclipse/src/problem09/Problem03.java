package problem09;
/**
 * 
 * 결혼식 - 그리디
 *
 */
import java.util.*;

class T implements Comparable<T>{
	int t;
	char g;
	T(int t, char g){
		this.t = t;
		this.g = g;
	}
	@Override
	public int compareTo(T o) {
		if(o.t==this.t) return this.g - o.g;
		else return this.t-o.t;
	}	
}

public class Problem03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    ArrayList<T> arr = new ArrayList<>();
	    for(int i=0; i<n; i++) {
	    	int st = in.nextInt();
	    	int et = in.nextInt();
	    	arr.add(new T(st, 's'));
	    	arr.add(new T(et, 'e'));
	    }
	    solution(arr);
	    return ;
	}

	private static void solution(ArrayList<T> arr) {
		int cnt = 0;
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		for(T ti : arr) {
			if(ti.g == 's') cnt += 1;
			else if(ti.g == 'e') cnt -= 1;
			answer = Math.max(answer, cnt);
		}
		System.out.println(answer);
	}

}
