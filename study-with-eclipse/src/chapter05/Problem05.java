package chapter05;

import java.util.*;

public class Problem05 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str = in.next();
    System.out.println(solution(str));
    return ;
  }
  
  public static int solution(String str) {
	  Stack<Character> stack = new Stack<>();
	  int result = 0;
	  for(int i=0; i<str.length(); i++) {
		  if(str.charAt(i) == '(') stack.push('(');	// ���°�ȣ�� ������ push
		  else { // �ݴ� ��ȣ�ΰ��
			  stack.pop(); // ��ȣ�� ¦ pop������
			  if(str.charAt(i-1) == '(') result += stack.size();	// ������ȣ�� ���°�ȣ�϶��� �������� ��� ���, �����ŭ �����ش�
			  else result++; // ���� ��ȣ�� �ݴ� ��ȣ�϶� ����ũ�⸦ ��Ÿ���°��̱⿡ +1�� ���ش�
		  }
	  }  
	  
	  return result;
  }
}