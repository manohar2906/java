import java.util.Arrays;
public class VarKeyWord {
    public void main(){
        var a=95.565;
        System.out.println(a);
        //in initializing in array by using var keyword brackets are not allowed
        var b=new int[5];
        b[0]=4;
        b[1]=5;
        b[2]=6;
        b[3]=7;
        b[4]=8;
        System.out.println(Arrays.toString(b));
        var name="mani";
        System.out.println("name is : "+name);
        int var=5676;
        System.out.println("var keyword can be used as an variable name"+var);
    }
    public static void main(String args[]){
    new VarKeyWord().main();
    }
}