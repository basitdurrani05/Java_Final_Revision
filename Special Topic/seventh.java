// Last Topic : File Handling

// 3). Read File

import java.io.FileReader;

public class seventh {


    public static void main(String[] args) throws Exception{

        FileReader a = new FileReader("basit.txt");

        int i;

        while((i=a.read())!=-1){

            System.out.print((char)i);
        }



        

    }
    
}
