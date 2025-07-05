// 4). Hierarchical  Inheritance

// 1 parents : 2 child.


class A{   // Parents

    public void parents(){

        System.out.println("Mummy : Papa");
    }
}



public class seventh extends A {  // Me

    public void son(){

        System.out.println("Son");
    }

    public void daughter(){

        System.out.println("Daugter");
    }


    public static void main(String[] args) {


        seventh obj = new seventh();

        obj.parents();
        obj.son();
        obj.daughter();


        
    }
    
}
