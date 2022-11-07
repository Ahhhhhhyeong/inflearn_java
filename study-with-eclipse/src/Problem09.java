/**
 * 
 * 9. ���ڸ� ����
 *
 */
import java.util.*;

public class Problem09 {

	public int solution(String s) { // �ƽ�Ű���� ���Ͽ� ����ϱ�
		int answer = 0; 
		// �ƽ�Ű 48~57 : ����(0~9)
		for( char x : s.toCharArray()) {
			if(x >= 48 && x <= 57) answer = answer*10+(x-48);
		}
		
		return answer;
	}
	
	public int solution2(String s) { //Character.isDigit�� ����Ͽ� �����ϱ�
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
