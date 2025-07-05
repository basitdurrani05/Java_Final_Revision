// 2). Multiple Inheritance - 2 Child and 1 Parents

// Keyword Interface - implements

// Achieve 100% Full Inheritace through Inteface.


interface A{

    public void son();

}

interface B{

    public void daughter();
}


public class fifth implements A,B {

    public void son(){

        System.out.println("Beta");
    }

    public void daughter(){

        System.out.println("Beti");
    }

    public void parents(){

        System.out.println("Mummy : Papa");
    }


    


    public static void main(String[] args) {

        fifth obj = new fifth();

        obj.son();
        obj.daughter();
        obj.parents();


        
    }
    
}
