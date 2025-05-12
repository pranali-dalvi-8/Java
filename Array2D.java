import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        for(int i=0 ; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.println("enter the marks of class : " + i + " student " +j );
                a[i][j]= sc.nextInt();
            }
        } 
        System.out.println(" marks of students are as follows : ");

        for(int i=0 ; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " " );
                
            }
            System.out.println();
        } 
    }
}
