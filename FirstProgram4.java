import java.util.Scanner;
public class FirstProgram4{
public static void main (String [] args){
	Scanner scanobj;
	scanobj = new Scanner(System.in);
	int a;
	System.out.print("enter the value");
	a = scanobj.nextInt();
	if (a%2==0)
	{
	System.out.println("Divisible by 2");
	}
	else
	{
	System.out.println("Not Divisible3 by 2");
	}
}}