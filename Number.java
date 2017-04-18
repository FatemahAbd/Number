import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Please enter an integer between 1,000 and 999,999: ");
        String num= in.next();
        int w= num.length();
        String s1= num.substring(0, w-4);
        String s2= num.substring(w-3, w);
        System.out.println(s1+s2);
    }
}
