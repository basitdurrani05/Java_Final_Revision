// Inheritance 

// Keyword : extends   - Copy

// Parents and Child

// 1). Single
// 2). Multiple   Exception (Access through Interface)
// 3). Multilevel
// 4). Hierarchicsl
// 5). Hybrid


class B{    // Parnets Class

    public void parents(){

        System.out.println("Mummy - Papa  : Singing,Dancing,Arts");
    }


}


public class fourth extends B {    // Me - Class.

    // 1). Single   - 1 Parents and 1 child



    public void child(){

        System.out.println("New Born Baby(Son/Daughter) : Singing");


    }



    public static void main(String[] args) {

        fourth obj = new fourth();

        obj.parents();
        obj.child();






        
    }
    
}
