import java.util.Scanner;
public class PalindrromicNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of the array");
            int arrsize=sc.nextInt();
            int arr[] = new int[arrsize];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int rev=0;
            int rem=arr[i];
            while(rem!=0){
                rev=rev*10+rem%10;
                rem=rem/10;
            }
            if(rem==arr[i])
            System.out.println("it's a palindrome");
            else
            System.out.println("its not a palindrome");
        }
        sc.close();
    }
}
