//0,1,1,2,3
public class D_FabonacciSeries {
    public static void main(String[] args) {
        int a=0,b=1,c;
        System.out.print(a+ " "+b);
        for(int i=2; i<=10;i++){
            c=a+b;
            System.out.print(" "+c+" ");
            a=b;
            b=c;
        }

    }
}
