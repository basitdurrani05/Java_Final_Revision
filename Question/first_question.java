public class first_question {

    public static void main(String[] args) {

        // Star Pattern

        // 1). Left Half Pyramid

        // for(int i=1; i<=5; i++){   // Row

        //     for(int j=1; j<=i; j++){   // Coloumn  

        //         System.out.print("*");
        //     }
        //     // Line print ho jaye
        //     System.out.println();

          
        // }


        // 2). Reverse Left Half Pyramid.


        for(int i=1; i<=5; i++){

            for(int j=5; j>=i; j--){    

                System.out.print("*");
            }

            System.out.println();
        }






        
    }
}