package problem09;

import java.util.*;

class Time implements Comparable<Time>{
	int st, et;
	Time(int st, int et){
		this.st = st;
		this.et = et; 
	}
	@Override
	public int compareTo(Time o) {
		if(this.et==o.et) return this.st-o.st;
		else return this.et-o.et;
	}	
}

public class Problem02 {	
	public static void main(String[] args){
	    Scanner in=new Scanner(System.in);
	    int n = in.nextInt();
	    ArrayList<Time> arr = new ArrayList<>();
	    
	    for(int i=0; i<n; i++) {
	    	int start = in.nextInt();
	    	int end = in.nextInt();
	    	arr.add(new Time(start, end));
	    }
	    
	    interview(n, arr);
	    return ;
	 }

	private static void interview(int n, ArrayList<Time> arr) {
		int cnt = 0;
		int e =0;
		Collections.sort(arr);
		for(Time ob : arr) {
			if(ob.st>=e) {
				cnt+=1;
				e = ob.et;
			}
		}
		System.out.println(cnt);
	}
}
