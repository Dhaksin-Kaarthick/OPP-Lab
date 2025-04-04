import java.io.BufferedWriter;
import java.io.FileWriter;

public class filehandeling {
    public static void main(String[] args) {
        try{
            FileWriter file=new FileWriter("D://Code//Java//output.txt",true);
            BufferedWriter b=new BufferedWriter(file);
            b.write("dhaksin");
            b.newLine();
            b.write("hello");
            b.close();

            

        }
        catch(Exception e){
            System.out.println("error");

    }
    }  
}
