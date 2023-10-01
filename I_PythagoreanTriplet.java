public class I_PythagoreanTriplet {
    public static void main(String[] args) {
        int a[] ={3, 1, 4, 6, 5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++ ){
                   // Calculate square of array elements
                    int x=a[i]*a[i];  int y=a[j]*a[j]; int z=a[k]*a[k];
                    if(x==y+k || y==x+k || z==x+y){
                         // If we reach here, triplet found
                        System.out.println("The array contains Pythagorean Triplet ");
                    }
                   
                }
            }
        }
    }
}