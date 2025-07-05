// 5). Hybrid Inheritance

//  dadaji -> papajii -> Me -> papajii/Mummyjii -> dadi jii/ dadajii -> Me ->.............


class A{

    public void dadaji(){

        System.out.println("Dada Jii");


    }


}

class B extends A{


    public void papajii(){

        System.out.println("Papa Jii");
    }
}


public class eighth extends B {   // Me

    public void me(){

        System.out.println("Me : John");
    }
    


    public static void main(String[] args) {

        eighth obj = new eighth();

        obj.dadaji();
        obj.papajii();
        obj.me();




        
    }
    
}
