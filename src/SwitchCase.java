import java.util.Scanner;

public class SwitchCase {
    public static void main(String [] args){
        int num = 10;
        System.out.println(isLuckyNumber(num));
        Scanner sc = new Scanner(System.in);
    }
    private static boolean isLuckyNumber(int number){
        if(number == 7){
            return true;
        }else{
            return false;
        }
    }
}
