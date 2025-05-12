class Demo{
    public static void Disp1(){
        System.out.println("this is static method");
    }
    public void Disp2(){
        System.out.println("this is non static method");
    }
}

public class StaticNonStaticMethod {
    public static void main(String[] args) {
         Demo.Disp1();
         Demo d=new Demo();
        //  d.Disp1();
         d.Disp2();
    }
}
