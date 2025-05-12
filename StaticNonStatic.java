public class StaticNonStatic {
    static int a,b,c;

    static {
        System.out.println("static block");
        a=10;
        b=20;
        c=30;
     }
    
     static void Disp1(){
        System.out.println("This is Static method ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
     }

     public int m,n,o;

     StaticNonStatic(){
         System.out.println("constructor");
         m=100;
         n=200;
         o=300;
         a=50;
         b=60;
         c=70;
     }

     public void Disp2(){
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
     }

    public static void main(String[] args) {
        System.out.println("main method");
        Disp1();
        StaticNonStatic sc =new StaticNonStatic();
        sc.Disp2();
    }
}
