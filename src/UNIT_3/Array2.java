package UNIT_3;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        int n,m;
        int a[][]=new int[2][3];
        int b[][]=new int[2][3];
        int c[][]=new int[2][3];
        System.out.println("this is for first matrix: ");

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++){
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("this is for 2nd matrix: ");
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++){
                b[i][j] = input.nextInt();
            }
        }

        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                c[i][j]= a[i][j]+b[i][j];

            }
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
//                System.out.println(c[i][j]);
                System.out.print(c[i][j]);

            }
            System.out.println(" ");
        }



    }
}

