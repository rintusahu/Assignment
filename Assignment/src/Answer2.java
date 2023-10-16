import java.util.HashMap;
import java.util.Scanner;

public class Answer2 {

    public int getval(char ch){
        switch (ch){
            case'I':return 1;
            case'V':return 5;
            case'X':return 10;
            case'L':return 50;
            case'C':return 100;
            case'D':return 500;
            case'M':return 1000;
            default:return 0;
        }
    }
    public int romanToInt(String s){
        int n = s.length();
        int sum =0;
        for (int i=0; i<n; i++){
            char ch1 = s.charAt(i);
            if ((i+1)<n && getval(ch1)<getval(s.charAt(i+1)))
                sum=sum-getval(ch1);
            else sum=sum+getval(ch1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Answer2 a = new Answer2();
        System.out.println("Enter the roman number");
        String rom = new Scanner(System.in).next();
        int r = a.romanToInt(rom);
        System.out.println(r);
    }
}
