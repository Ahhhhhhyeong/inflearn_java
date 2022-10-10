/**
 * Problem05
 * 특정 문자 뒤집기
 */
import java.util.Scanner;

public class Problem05 {
    public String soultion(String str){
        char[] arr = str.toCharArray();
        int lt = 0, rt=str.length()-1;

        while (lt<rt) {
            if(!Character.isAlphabetic(arr[lt])) lt++;
            else if(!Character.isAlphabetic(arr[rt])) rt--;
            else{
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }
        
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(new Problem05().soultion(in.nextLine()));
    }
}