// Method

// 1). Static   - Direct Call
// 2). Non- Static   - through Object

public class fifteen {

    // Static

    // public static void greet(){

    //     System.out.println("Good Evening.... Basit, How are You ?");
    // }


    // Non Static

    public void greet(){

        System.out.println("Good Evening.... Basit, How are You ?");
    }


    public static void main(String[] args) {

        // Static
        // greet();

        // Non Static

        fifteen obj = new fifteen();

        obj.greet();
        

    }
    
}
