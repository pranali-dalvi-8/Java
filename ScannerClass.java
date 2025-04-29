import java.util.Scanner;

class Addition{
    int add(int a, int b){
        int result = a+b;
        return result;

    }
}


public class ScannerClass {
   public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b = sc.nextInt();

    Addition calc = new Addition();
    int result = calc.add(a, b);
    System.out.println(result);
    
   }  
}
