// Most Imp :  Multithreading - Multiple thread at a time

// Method 

// 1). Extend Thread Class
// 2). By Using Runnable Interface


// 1). Extend Thread Class


public class third extends Thread {

    public void run(){    // Build Thread Method Name Is : run()

        try{

            for(int i=0; i<=5; i++){

                System.out.println("Basit - Game");
                Thread.sleep(5);
            }
        }

        catch(Exception e){   // Handle the error (try catch are close friend)

            System.out.println("Aree yaar tune error laa diya......");
        }


    }


    public static void main(String[] args) throws Exception  {

     third obj = new third();

     obj.start();  // Executed Thread Method Name Is : start()


    //  Normal Loop

    for(int i=0; i<=5; i++){

        System.out.println("Basit - Work");
        Thread.sleep(5);
    }






      



        
    }
    
}
