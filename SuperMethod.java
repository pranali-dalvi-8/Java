class Demo{
    int a,b,c;

    public Demo(){
        a=10;
        b=20;
        c=a+b;
    }

    public Demo(int x, int y){
        c=x+y;
    }
}
class Demo1 extends Demo{
    
    int m,n,o;

    public Demo1(){
        super(10,20); 
        m=10;
        n=20;
        o=m+n;
    }

    public Demo1(int x, int y){
        this();
        o=x+y;
    }

    public void Display(){
        System.out.println(c);
        System.out.println(o);
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Demo1 d = new Demo1(10,20);
        d.Display();
    }
}
