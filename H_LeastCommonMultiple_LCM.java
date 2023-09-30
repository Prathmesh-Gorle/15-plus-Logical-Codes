import java.util.Scanner;
public class H_LeastCommonMultiple_LCM {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int l1= n1*n2;                 //this require for finding the LCM
        while(n1 != n2){
            if(n1>n2){
                n1= n1-n2;
            }else{
                n2= n2-n1;
            }

        }
       
        int lcm = l1/n1;   //here n1 is an GCD
        System.out.println("LCM of given no. is "+lcm);
        System.out.println(l1);
    }

}
