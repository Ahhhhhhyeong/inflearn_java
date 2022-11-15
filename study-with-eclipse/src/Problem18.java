/**
 * ������ �Ҽ�
 */
import java.util.Scanner;
  
public class Problem18 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    
    for(int i=0; i<n; i++) {
    	int ch = in.nextInt();
    	int re = 0;
    	while(ch != 0) { // ���� ������
    		re = re * 10 + ch %10;
    		ch /= 10;
    	}
    	if(checkNum(re) && re != 1) System.out.printf("%d ", re);
    }
    
    return ;
  }
  
  public static boolean checkNum(int n) { // ��Ʈ�� Ȱ���� ��� -> i�� ���������� üũ��
	  for(int i=2; i*i<=n; i++) {
		  if(n%i == 0) return false;
	  }
	  return true;
  }
}