public class F_Perfectnumber  {
    public static void main(String[] args) {
      int n=6,sum=0, i=1;
      while(i<= n/2){
          if(n%i ==0) {
              sum = sum + i;
          }
              i++;
      }
       
      if(n==sum){
          System.out.println(n+" is an perfect number");
      }else{
          System.out.println(n+" is not an perfect number");
      }
    }
}

/*Example 6,28,496,8128
Input : 6
Output : Yes, it's a Perfect Number
Since, 6 = 1 + 2 + 3 (which are its divisors)
  for 28 =1+2+4+7+14
*/
