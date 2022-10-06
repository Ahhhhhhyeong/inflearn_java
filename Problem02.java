/**
 * Problem02
 * 대소문자 변환
 */
import java.util.Scanner;

public class Problem02 {
    public String solution(String str){
        String result = "";
        for(char x : str.toCharArray()){
            if(Character.isUpperCase(x)) result += Character.toLowerCase(x);
            else result += Character.toUpperCase(x);
        }        
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Problem02 sol = new Problem02();
        System.out.println(sol.solution(in.nextLine()));
    }
}

