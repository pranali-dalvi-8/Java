class Laptop{
    int ram = 8 ;
    int cpu;

    public void doSomething(){
           System.out.println("do something running");
           System.out.println(ram);
    }
}


public class ClassObj {
    public static void main(String args[]){
          
        Laptop obj = new Laptop();
        obj.ram =16;
        obj.doSomething();
    }
}
