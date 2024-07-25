import java.util.Arrays;
import java.util.Scanner;
public class StaticAndNonStatic{
    //static is initialized by using static keyword
    //it can be acceced directly without creating a new keyword
    static{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int arrsize=sc.nextInt();
    int arr[]=new int[arrsize];
    System.out.println("enter the value of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            }
        int arr1[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
        arr1[i]=arr[arr1.length-i-1];
        }
        System.out.println(Arrays.toString(arr1));
        sc.close();
    }
    //not static keyword is initialized without static 
    //it can be acceced by creating an object
    {
        try (Scanner sc = new Scanner(System.in)) {
            int a=4,b=5;
            System.out.println("enter an operator 1.addition 2.subtraction");
            int s=sc.nextInt();
            switch(s){
                case 1 -> System.out.println("addition is : "+(a+b));
                case 2 -> System.out.println("subtraction is : "+(a-b));
                default -> System.out.println("enter a correct operator");
            }
        }
    }
    public void manu(){
        System.out.println("successfully executed");
    }
    public static void main(String args[]){
        StaticAndNonStatic st=new StaticAndNonStatic();
        st.manu();
        }
}