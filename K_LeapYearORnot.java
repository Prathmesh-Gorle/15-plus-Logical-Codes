// Leap year program in Java
// If the year satisfies either of the conditions, it's considered a leap year -
// 1. The year must be divisible by 400.
// 2. The year must be divisible by 4 but not 100.
public class K_LeapYearORnot{
    public static void main (String[]args)
    {
 
      int year = 2024;
 
      if (year % 400 == 0)
        System.out.println (year + " is a Leap Year");
 
      else if (year % 4 == 0 && year % 100 != 0)            //must not be divisible by 100 bcoz 100,200,300 are not leap years
        System.out.println (year + " is a Leap Year");
 
      else
          System.out.println (year + " is not a Leap Year");
 
    }
  }