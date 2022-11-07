/**
 * 
 * 9. 숫자만 추출
 *
 */
import java.util.*;

public class Problem09 {

	public int solution(String s) { // 아스키문자 비교하여 계산하기
		int answer = 0; 
		// 아스키 48~57 : 숫자(0~9)
		for( char x : s.toCharArray()) {
			if(x >= 48 && x <= 57) answer = answer*10+(x-48);
		}
		
		return answer;
	}
	
	public int solution2(String s) { //Character.isDigit를 사용하여 누적하기
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 String input1 = in.nextLine();
		 System.out.println(new Problem09().solution2(input1));

	}

}
