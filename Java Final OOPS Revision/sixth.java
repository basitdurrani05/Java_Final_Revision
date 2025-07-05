// 3). Multilevel Inheritance


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


public class sixth extends B {   // Me

    public void me(){

        System.out.println("Me : Smith");
    }
    


    public static void main(String[] args) {

        sixth obj = new sixth();

        obj.dadaji();
        obj.papajii();
        obj.me();


        
    }
    
}
