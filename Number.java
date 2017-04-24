import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        //an object from the class Scanner
        Scanner in= new Scanner(System.in);
        /*the print sentence to make the user enter what we want from him to enter
        in this case we want to enter an integer number between 1,000 and 999,999 with a comma*/
        System.out.println("Please enter an integer between 1,000 and 999,999: ");
        //this move to allow the user to enter
        String num= in.next();
        //this to bring how many number in the entered number
        int w= num.length();
        //the three coming sentence to print the same number that the user enteed but without comma
        String s1= num.substring(0, w-4);
        String s2= num.substring(w-3, w);
        System.out.println(s1+s2);
    }
}
