import java.util.Scanner;
public class ReversePattern {
    public  static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int rows=sc.nextInt();
            int columns=sc.nextInt();
            for(int i=0;i<=rows;i++){
                for(int j=columns;j>0;j--){
                    if(i==j){
                        break;
                    }
                    System.out.print(" "+j);
                }
                System.out.println();
            }
        }
          
    }
}
