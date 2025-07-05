// Polymorphism - Single action in different Ways

// Type

// 1). Compile Time - Simlar (Method Overloading)
// 2). Run Time - Similar (Method Overriding)


public class ninth {

    // 1). Compile Time (Method Overloading)

    public void basit(){

        System.out.println("Home : Son, Brother...");
    }

    public void basit(String company){

        System.out.println("Company : "+company);
    }

    public void basit(String a,String b){

        System.out.println("College : "+a+" "+b);


    }

    

   




    public static void main(String[] args) {

        ninth obj = new ninth();

        obj.basit();
        obj.basit("Software Engineer");
        obj.basit("Friend","Student");


        

    }
    
}
