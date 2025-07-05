// 2). By Using Runnable Interface MultiThreading


public class fourth implements Runnable {


    public void run(){


        try{


            for(int i=0; i<=5; i++){

                System.out.println("Basit : Game..");
                Thread.sleep(5);
            }
        }
        catch(Exception e){

            System.out.println("Bhai Error Mat laana,Izzazt ka sawal Hai...");


        }
    }




    public static void main(String[] args) throws Exception {

        fourth obj = new fourth();

        Thread basit = new Thread(obj);


        basit.start();

      



        for(int i=0; i<=5; i++){

            System.out.println("Basit : Chrome...");
            Thread.sleep(5);
           
           
        }





        
    }
    
}
