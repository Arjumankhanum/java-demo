import java.util.Scanner;
public class multiarray3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and columns of A");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("enter the number of rows and columns of B");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];
        System.out.println("enter the elements of A matrix");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements of B matrix");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("multiplication of  2 matrix");
        for (int i = 0; i <r1 ; i++) {
            for (int j = 0; j < c2; j++) {
                for(int k=0;k<c1;k++){
                    C[i][j] =C[i][j] + A[i][k] * B[k][j];
                }

            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}


