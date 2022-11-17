package problem07;
/**
 * 
 * �κ����� ���ϱ�(DFS)
 * 3�� �κ�����
 * {1,2,3} {1,2} {1,3} {1} {2,3} {2} {3}
 */
public class Problem06 {
	static int n;
	static int[] ch;
	private static void DFS(int L) {
		if(L==n+1) {
			String tmp = "";
			for(int i=1; i<=n; i++) {
				if(ch[i]==1) tmp+=(i + " ");
			}
			if(tmp.length()>0) System.out.println(tmp);
		}else {
			ch[L] = 1;
			DFS(L+1); // �������� ����
			ch[L] = 0;
			DFS(L+1); // ���������� ����
		}
	}
	
	public static void main(String[] args) {
		n = 3;
		ch = new int[n+1];
		DFS(1);
	}
	
}
