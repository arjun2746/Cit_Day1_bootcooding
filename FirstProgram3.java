import java.util.Scanner;
public class FirstProgram3{
public static void main (String[] args){
Scanner scanobj;
scanobj = new Scanner(System.in);
int a, b;
System.out.println("Enter the Value 1:");
a = scanobj.nextInt();
System.out.println("Enter the Value 2:");
b = scanobj.nextInt();
System.out.println("Addition :" +(a+b));
System.out.println("Subtraction :"+(a-b));
System.out.println("Multiplication :" + (a*b));
System.out.println("Division :"+(a/b));
System.out.println("Modula :"+(a%b));
scanobj.close();
}}