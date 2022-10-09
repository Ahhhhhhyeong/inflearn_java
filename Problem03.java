/**
 * Problem03
 * 문장 속 단어
 */
import java.util.Scanner;

public class Problem03 {
    
    public String solution(String str){
        String result = "";
        String[] arr = str.split(" ");

        for(String x : arr){
            if(x.length() > result.length()){
                result = x;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Problem03 t = new Problem03();
        System.out.println(t.solution(in.nextLine()));
    }
}