import java.io.*;
class Filemissing extends Exception{
Filemissing(String message){
super(message);
}
}
public class main4{
public static void main(String[] args) throws Filemissing, IOException {
String filename="example.txt";
try{

readfile("example.txt");
}
catch(FileNotFoundException e){
throw new Filemissing("File not found: " + filename);
}
}
public static void readfile(String filename) throws Filemissing,IOException {
FileReader file = new FileReader(filename);
BufferedReader reader= new BufferedReader(file); 
String line=reader.readLine();

while(line!=null){
System.out.println(line);
line=reader.readLine();
}
reader.close();

}

}