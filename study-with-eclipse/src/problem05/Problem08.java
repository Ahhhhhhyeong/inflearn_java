package problem05;
/**
 * ¿¿±ﬁΩ«
 */
import java.util.*;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Problem08 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int N = in.nextInt();
    int M = in.nextInt();
    int[] arr = new int[N];
    for(int i=0; i<N; i++) arr[i] = in.nextInt();
    System.out.println(solution(N, M, arr));
    return ;
  }
  
  private static int solution(int n, int m, int[] arr) {
	  int result = 0;
	  Queue<Person> Q = new LinkedList<>();
	  for(int i=0; i<n; i++) Q.add(new Person(i, arr[i]));
	  while(!Q.isEmpty()) {
		  Person tmp = Q.poll();
		  for(Person x : Q) {
			  if(x.priority > tmp.priority) {
				  Q.add(tmp);
				  tmp = null;
				  break;
			  }
		  }
		  if(tmp != null) {
			  result++;
			  if(tmp.id == m) return result;
		  }
	  }	  
	  return result;
  }
}