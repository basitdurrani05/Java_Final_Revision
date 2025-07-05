// Abstraction - Hiding the implementation

// abstract   - 1 abstract class mai kam sae kam 1 abstract method hona mandotary hai..

abstract class A{

    abstract public void basit();
}

public class eleventh extends A {

    public void basit(){

        System.out.println("Hello I am abstraction , My name is Basit Durrani...");


    }



    public static void main(String[] args) {

        eleventh obj = new eleventh();

        obj.basit();
        
    }
    
}
