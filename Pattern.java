import java.util.Scanner;
     public  class Pattern{

    public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter number of rows");
        int rows=sc.nextInt();
         System.out.println("enter number of columns");
        int columns=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                if(i==j){
                    break;
                }
             System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    }
}
