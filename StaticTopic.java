public class StaticTopic {
   static int a,b,c;             //static keyword

   static{
    System.out.println("Static Block");
    a=10;
    b=20;
    c=30;

   }
 static void Disp(){
        System.out.println("static method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String args[]){
    System.out.println("main method");
    Disp();
    }

}
