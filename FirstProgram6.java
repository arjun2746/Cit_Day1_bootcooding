import java.util.Scanner;
public class FirstProgram6{
public static void main (String [] args){
	int i = 0; 
	Scanner scanobj = new Scanner(System.in);
	String str;
	System.out.println("Do you want to continue ?");
	System.out.println("Yes : y \n No : n");
	str = scanobj.nextLine();
	String str2 = "y";
	while (str2.equals(str))
	{
	
	System.out.println("No of iterations :"+i);
	i++;
	System.out.println("Enter the new value :");
	str = scanobj.nextLine();
	
	}
	
}}