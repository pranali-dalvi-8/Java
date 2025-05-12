import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a[] = new int[5];
        for(int i=0; i < a.length; i++){
            System.out.println("Please enter the marks of student " +(i+1));
            Scanner sc = new Scanner(System.in);
            a[i]=sc.nextInt();
        }

        System.out.println("marks of student are as follows");

        for(int i=0 ; i<a.length; i++){
            System.out.print(a[i] + " ");

        }
    }
}
