public class main{
public static void main(String[] args){
try{
int result=10/0;
}
catch(ArithmeticException e){
System.out.println("Caught exception "+e);
}
finally {
 System.out.println("This is the finally block. It runs always.");
}
}
}