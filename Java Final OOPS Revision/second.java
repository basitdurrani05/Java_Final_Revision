// Getter and Setter - Encapsulation

// Getter - Read the Value
// Setter - Set/ Update the Value

public class second {

    private String e_name;
    private int id;

    public void setA(String a){

        e_name=a;    // private + public = public
    }

    public String getA(){
        return e_name;

      
    }

    public void setB(int b){

        id = b;


    }

    public int getB(){

        return id;
    }

    public static void main(String[] args) {

        second obj = new second();

        // obj.setA("Basit");
        // obj.setB(120);

        obj.setA("Amisha");
        obj.setB(30);

        // System.out.println("E_Name : "+obj.getA());
        // System.out.println("E_Id : "+obj.getB());

        System.out.println("E_Name : "+obj.getA());
        System.out.println("E_Id : "+obj.getB());





        
    }
    
}
