public class Recursion {

        public static void add(int i){
            i++;
            System.out.println(i);
            add(i);
         }

        public static void main(String args[]){
            add(0);
        }
}