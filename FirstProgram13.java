import java.util.Scanner;
public class FirstProgram13{
public static void main(String [] args){
	int num , result = 1;
	Scanner scanobj = new Scanner(System.in);
	System.out.println("Enter the number");
	num = scanobj.nextInt();
	
	for(int i = num; i > 0; i--)
	{
	result = result*i;
	}
	System.out.println("Factorial of "+num+"is "+result);
	
	
}}