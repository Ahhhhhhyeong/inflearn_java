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
        
        System.out.println(solution(a, c));
        return;
    }

    public static int solution(String str, char c){
        return str.length() - str.replace(String.valueOf(c), "").length();
    }
}