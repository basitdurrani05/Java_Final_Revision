// 2). Run Time (Method Overriding)


class A{

    public void basit(){

        System.out.println("Basit Is a Good Boy...");
    }



}

public class tenth extends A {

    @Override
    public void basit(){

        System.out.println("Basit Is a Bad Boy....");
    }

    public static void main(String[] args) {

        tenth obj = new tenth();
        A obj2 = new A();

        obj.basit();
        obj2.basit();
        

    }
    
}
