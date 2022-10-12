/**
 * Problem06
 * 중복문자제거
 */
import java.util.Scanner;

public class Problem06 {
    public String soultion(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(i == str.indexOf(str.charAt(i))){
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        System.out.println(new Problem06().soultion(in.nextLine()));
    }
}
