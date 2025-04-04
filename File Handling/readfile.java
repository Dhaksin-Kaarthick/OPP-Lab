
import java.io.BufferedReader;
import java.io.FileReader;

public class readfile {
    public static void main(String[] args) {
        try {
            FileReader r=new FileReader("D://Code//Java//output.txt");
            BufferedReader v=new BufferedReader(r);
            String e=v.readLine();
           
           
            while(e!=null){
                System.out.println(e);
                
         
                e=v.readLine();
            }
            v.close();
        } catch (Exception e) {
            System.out.println("error");
        
        }
        
    }
    
}
