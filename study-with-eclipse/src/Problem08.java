/**
 * 
 * 8. ��ȿ�� �Ӹ����
 * 
 */
import java.util.*;

public class Problem08 {
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", ""); //���ĺ������� ���� 
		String tmp = new StringBuilder(s).reverse().toString(); 
		if(s.equals(tmp)) answer = "YES";
		
		return answer;
	}
	
	public static void main(String[] args) {
		Problem08 T = new Problem08();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}

}
