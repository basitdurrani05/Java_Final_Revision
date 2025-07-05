// Array


//  1). One Dimensional
//  2). Multi Dimensional

import java.util.Scanner;

public class fourteen {


    public static void main(String[] args) {

        // 1). One Dimensional


        // int []a = {12,13,14,15,16};

        // 1st Method

        // for(int i=0; i<a.length; i++){

        //     System.out.println(a[i]);
        // }


        // 2nd Method

        // for (int i: a) {

        //     System.out.println(i);
            
        // }


        // User Input in One Dimensional.

        // new - Reserve new Memory Space

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Array Elements : ");
        // int []a = new int[5];


    //    Input

    // for(int i=0; i<a.length; i++){

    //     a[i] = sc.nextInt();
    // }

    // // Output 

    // System.out.println("Array Elements : ");
    // for(int i=0; i<a.length; i++){

    //     System.out.print(a[i]+" ");
    // }


    // 2). Multi Dimensional

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Matrix : ");

    int [][]a = new int[3][3];

    // Input

    for(int i=0; i<a.length; i++){   // Row

        for(int j=0; j<a.length; j++){  // Coloumn

            a[i][j] = sc.nextInt();
        }


    }

    // OutPut


    System.out.println("Matrix : ");
    for(int i=0; i<a.length; i++){   // Row

        for(int j=0; j<a.length; j++){  // Coloumn

           System.out.print(a[i][j]+" ");
        }

        System.out.println();


    }





        

    }
    
}
