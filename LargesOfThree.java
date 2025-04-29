public class LargesOfThree {
    public static void main (String args[]){
         int n1 =10;
         int n2 = 20;
         int n3 = 30;
         if (n1>n2 && n1>n3){
            System.out.println(n1 + "is largest");
         }
         else if (n2>n1 && n2>n3){
            System.out.println(n2 + "is largest");
         }
         else{
            System.out.println(n3 + "is largest");
         }
    }
}
