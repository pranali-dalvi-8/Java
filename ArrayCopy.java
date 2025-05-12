import java.util.Scanner;

public class ArrayCopy {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        for(int i = 0; i<a.length ; i++){
            System.out.println("enter the value of first array " );
            a[i]=sc.nextInt();
        }
        System.out.println();
        for(int i = 0; i< b.length ;i++){
            b[i]=a[i];
            System.out.print(b[i] + " ");
        }
        

    }
}
