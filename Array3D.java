import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][][] = new int[3][2][3];


        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                for(int k=0; k<a[i][j].length; k++){
                    System.out.println("enter the marks of school " +i + " class " +j+ " student "+k);
                    a[i][j][k]=sc.nextInt();

                }
            } 
        }
        System.out.println("marks of students are as follows : ");
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                for(int k=0; k<a[i][j].length; k++){
                    System.out.print(a[i][j][k] + " ");

                }
                System.out.println();
            } 
            
        }
    }
}
