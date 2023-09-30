public class C_PalindromeCheckFor_String {
    public static void main(String[] args) {
    String Original1="Nayan";
    String Original=Original1.toLowerCase();
    char st1[]=Original.toCharArray();
    int n=Original.length();
    String rev="";
        for(int i=n-1;i>=0;i--){
            //rev =rev+Original.charAt(i);
            rev=rev+st1[i];
        }
       System.out.println(rev);
      
        if(Original.equals(rev)){
            System.out.println("It is an Palindromic String");
        }else {
            System.out.println("IT is not an Plaindromic String");
        }
    }
}
