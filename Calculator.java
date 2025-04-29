class CalculatorOperations{
    int a;
    int b;
    void add(){
        a=10;
        b=20;
        int c= a+b;
        System.out.println("addition : "+ c);
    }
    void sub(){
        a=10;
        b=20;
        int c= a-b;
        System.out.println("subtraction : "+ c);
    }
    void mul(){
        a=10;
        b=20;
        int c= a*b;
        System.out.println("multiplication : "+ c);
    }
    void div(){
        a=10;
        b=20;
        int c= a/b;
        System.out.println("division : "+ c);
    }
}


public class Calculator {
     public static void main(String args[])
     {
            CalculatorOperations calc=new CalculatorOperations();
            calc.add();
            calc.sub();
            calc.mul();
            calc.div();
     }
}
