class Addition{
    int add(int a, int b){
        int result = a+b;
        return result;
    }

    int add(int a, int b, int c){
        int result = a+b+c;
        return result;
    }
}


public class MethodOverloading {
    public static void main(String args[]){
        Addition calc = new Addition();
        int result = calc.add(10,20);
        int result1 = calc.add(10,20,30);
        System.out.println("Addition of two numbers : "+result);
        System.out.println("Addition of three numbers : "+result1);
    }
}
