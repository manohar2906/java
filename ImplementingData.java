import java.util.Scanner;
public class ImplementingData implements HidingData{

    @Override
    public void implemantation() {
        int currentBalance=1500;
        System.out.println(" BANK OFFICER :hello sir,how can i help you");
        System.out.println("CUSTOMMER : please check my current balance");
        Scanner sc = new Scanner(System.in);
        System.out.println("OFFICER : ok please enter your name");
        String depositerName=sc.nextLine();
        System.out.println("and enter your bank number also ");
        long bankNo = sc.nextInt();
        System.out.println("your name is : "+depositerName);
        System.out.println("your bank number is : "+bankNo);
        System.out.println("and your current balance is : "+currentBalance);
        sc.close();
    }

    @Override
    public void implemantation1() {
        int rows = 6;
        int columns = 6;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(i==j){
                    break;
                }
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    
}
