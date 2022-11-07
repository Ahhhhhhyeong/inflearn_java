/**
 * 
 * 10. 가장 짧은 문자거리
 *
 */
import java.util.*;

public class Problem10 {

	public int[] solution(String s, char t) {
		int[] answer= new int[s.length()];
		int p = 1000;
		
		for(int i=0; i<s.length(); i++) { // 왼쪽에서부터
			if(s.charAt(i) == t) {
				p=0;
				answer[i]=p;
			}
			else {
				p++;
				answer[i]=p;
			}
		}
		
		for(int i=s.length()-1; i>=0; i--) { // 오른쪽에서부터 체크하며 기존 배열과 비교하여 젤 작은 수로 교체
			if(s.charAt(i) == t) {
				p=0;
			}
			else {
				p++;
				answer[i]=Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String rs = in.nextLine();
		String[] find = rs.split(" ");
	    for( int x : new Problem10().solution(find[0], find[1].charAt(0))) {
	    	System.out.print(x + " ");
	    }
	    return ;
	}

}
