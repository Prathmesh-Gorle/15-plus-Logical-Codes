public class J_GreatestofThreeNumbers{
  public static void main (String[]args){

    int num1 = 10, num2 = 20, num3 = 30;

    //comparing num1 with other numbers
    if ((num1 >= num2) && (num1 >= num3))
        System.out.println (num1 + " is the greatest");

    //checking if num2 is greatest
    else if (num2 >= num1 && num2 >= num3)
        System.out.println (num2 + " is the greatest");

    // num3 has to be greatest then if not above
    else
        System.out.println (num3 + " is the greatest");
  }
}