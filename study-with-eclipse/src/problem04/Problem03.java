package problem04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Problem03 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    
    int[] arr = new int[n];
    for(int i=0; i<n; i++) {
    	arr[i] = in.nextInt();
    }
    solution(n,k,arr);
    return ;
  }
  public static void solution(int n, int k, int[] arr) {
	  ArrayList<Integer> result = new ArrayList<>();
	  HashMap<Integer, Integer> hs = new HashMap<>();
	  for(int i=0; i<k-1; i++) { //0~3(3개)
		  hs.put(arr[i], hs.getOrDefault(arr[i], 0) + 1);
	  }
	  int lt=0;
	  for(int rt=k-1; rt<n; rt++) { //4일차부터시작
		  hs.put(arr[rt], hs.getOrDefault(arr[rt], 0) + 1);
		  result.add(hs.size()); 	  // size() 함수를 사용하여 구하기
		  hs.put(arr[lt], hs.get(arr[lt])-1);
		  if(hs.get(arr[lt]) == 0) hs.remove(arr[lt]);
		  lt++;
	  }

	  for(int x : result) System.out.printf("%d ", x);
  }  
  
}