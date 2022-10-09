/**
 * Problem04
 * 단어 뒤집기
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        String[] str = new String[input];
        for(int i = 0; i < input; i++){
            str[i] = in.next();
        }
        for(String x : new Problem04().soultion(input, str)){
            System.out.println(x);
        }
    }

    private ArrayList<String> soultion(int n, String[] str) {
        ArrayList<String> result = new ArrayList<>();
        for(String x : str){
            result.add(new StringBuilder(x).reverse().toString());
        }
        return result;
    }
}
