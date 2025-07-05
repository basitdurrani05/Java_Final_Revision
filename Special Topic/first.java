// Advanced Java


// Enum   - Keyword


// A lots of data print use enum


public class first{

    public enum students{

        Amisha,
        Sneha,
        Mohan,
        Amit,
        Arun,
        Arbaj,
        Chandni,
        Himanshu
    }

    public static void main(String[] args) {

       for(students a : students.values()){
        System.out.println(a);
       }
        


    }
}