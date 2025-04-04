import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writeNread {
    public static void main(String[] args) {
    
        try (FileReader file = new FileReader("D:/Code/Java/input.txt");
             BufferedReader v = new BufferedReader(file);
             FileWriter A = new FileWriter("D://Code//Java//output.txt/");
             BufferedWriter f = new BufferedWriter(A)) {
             
            String line=v.readLine();
            int count=0;
            while (line!= null) {
                System.out.println(line);
                count+=line.length();
                f.write(line);
                f.newLine(); 
                line=v.readLine();
                
            }
            System.out.println(count);
            
        } catch (IOException e) {
            System.out.println("Some error: " + e.getMessage()); 
        }
    }
}