public class O_HarshadNumber {
    public static void main(String[] args)
	{
		int n = 12;  //ex. 10,12,18,24
		int temp=n;  //After Modification value should be safe
		
		int result = 0;
		// calculating sum of digits of a number
		while(n != 0){
			int pick_last = n % 10;
			result = result + pick_last;
			n = n / 10;
		}
		
      
      if(temp % result == 0){
      System.out.println("Harshad Number");
	  }
    else{
        System.out.println("Not a Harshad Number");
		}
}
}
/*
Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its digits or not.
*/