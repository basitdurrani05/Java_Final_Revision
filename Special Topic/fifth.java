// Last Topic : File Handling

// Operation : 
// 1). Create New File
// 2). Write File
// 3). Read File

import java.io.File;

public class fifth {

    public static void main(String[] args) throws Exception {


        // 1). Create New File

        File a = new File("mohan.txt");

        if(a.createNewFile()){

            System.out.println("Successfully...");
        }

        else{

            System.out.println("Does Not");
        }

       // try{ 

        //     if(a.createNewFile()){

        //         System.out.println("File Created Successfully........");
        //     }

        //     else{

        //         System.out.println("Does Not Create File because file already exists....");
        //     }



        // }

        // catch(Exception e){

        //     System.out.println("Bhai Yae toh error aa gaya.....");
        // }

        




        

    }
    
}
