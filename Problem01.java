/**
 * Problem01
 * 문자 찾기
 */
import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        String a = scan1.next();
        char c = scan1.next().charAt(0);
        
        Solution sol = new Solution();
        System.out.println(sol.solution(a, c));
        return;
    }

}

class Solution{
    
    public int solution(String str, char c){
        int result = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char x : str.toCharArray()){
            if(x==c) result++;
        }

        return result;
    }
}