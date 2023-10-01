import java.lang.Math;
public class A2_PrimeNumbers1_to_100{
	public static void main(String[] args){
		for(int i=1;i<=100;i++)
		{
		    if(checkPrime(i))
		    {
		        System.out.print(i+" " );
		    }
		}
	}
	public static boolean checkPrime(int num)
	{
	    // 0, 1 and negative numbers are not prime
	    if(num<2)
	    {
	        return false;
	    }
	    else
	    {
	       
            for(int i=2;i<Math.sqrt(num);i++){
	            if(num%i==0){
	                return false;
	            }
	        }
	    }
	    // the number would be prime if we reach here
	    return true;
	}
}
 // A number n is not a prime, if it can be factored into two factors a & b:
            // n = a * b
            /*Now a and b can't be both greater than the square root of n, since
            then the product a * b would be greater than sqrt(n) * sqrt(n) = n.
            So in any factorization of n, at least one of the factors must be
            smaller than the square root of n, and if we can't find any factors
            less than or equal to the square root, n must be a prime.*/
