import java.util.Scanner;
public class B_PalindromeCheckFor_Integer{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any value");
       int n = sc.nextInt();
       int remaninder, reverse = 0;
       int Original = n;

       while (n != 0) {
           remaninder = n % 10;                      //for getting the last digit
           reverse = reverse * 10 + remaninder;   
           n = n / 10;                               //for getting the remaining number 
               
       }

       if (Original == reverse) {
           System.out.println(Original + " is palindrom");
       } else {
           System.out.println(reverse + " is not palindrom");

       }
   }
}
