import java.util.Scanner;

interface Calculator {
   void add();
   void sub();    
}

class Calculator1 implements Calculator{
     public void add(){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the 1st number to add : ");
         int a = sc.nextInt();
         System.out.println("enter the 2nd number to add : ");
         int b = sc.nextInt();

         int c = a + b;
         System.out.println(c);
     }
     public void sub(){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the 1st number to sub : ");
         int a = sc.nextInt();
         System.out.println("enter the 2nd number to sub : ");
         int b = sc.nextInt();

         int c = a - b;
         System.out.println(c);
     }
}
class Calculator2 implements Calculator{
    public void add(){
       int a =10;
       int b =30;
       int c = a+b;
       System.out.println(c);
    }
    public void sub(){
         int a =30;
       int b =10;
       int c = a - b;
       System.out.println(c);
    }
}

class Cal{
    public void permit(Calculator ref){
        ref.add();
        ref.sub();
    }
}

public class InnerInterfaceEx {
    public static void main(String[] args) {
        Calculator1 c1 = new Calculator1();
        Calculator2 c2 = new Calculator2();
         Cal c = new Cal();
         c.permit(c1);
         c.permit(c2);
    }
}
