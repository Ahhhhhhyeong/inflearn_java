/**
 * �Ǻ���ġ ����
 */
import java.util.Scanner;
  
public class Problem16 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int num = in.nextInt();
    
    int a=1, b=1, c; // �迭�� ������� �ʾ��� ��
    System.out.printf("%d %d ", a, b);
    for(int i = 2; i < num; i++) {
    	c = a + b;
    	System.out.printf("%d ",c);
    	a = b;
    	b = c;
    }
    
    // ����Լ��� �޺κп��� ��� �� ����
    
    return ;
  }
  
  public static void arr(int num) { //�迭�� ��� ���� ��
	  int[] arr = new int[num];
	  arr[0] = 1;
	  arr[1] = 1;
	  for(int i = 2; i < num; i++) {
	   	arr[i] = arr[i-1] + arr[i-2];
	  }
	    
	  for(int x : arr) {
	  	System.out.printf("%d ", x);
	  }
  }
}