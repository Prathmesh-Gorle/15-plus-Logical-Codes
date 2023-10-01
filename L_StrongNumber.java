public class L_StrongNumber {
  public static void main (String[]args)  {
    int num = 145;
    if (detectStrong (num))
        System.out.println (num + " is Strong Number");
    else
        System.out.println (num + " is not a Strong Number");
  }
  // function to calculate factorial
  static int facto (int num){
     if(num == 0)
        return 1;    
    return num * facto(num-1);
  }

  static boolean detectStrong (int num) {
     int digit, sum = 0;
     int temp = num;
        // calculate 1! + 4! + 5!
    while(temp!=0){
        digit = temp % 10;
        sum = sum + facto(digit);
        temp /= 10;
    }
    
    // returns 1 if both equal else 0
    return sum == num;

  }
}