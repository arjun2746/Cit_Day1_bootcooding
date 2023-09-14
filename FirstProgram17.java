import java.util.Scanner;

public class FirstProgram17{
public static void main(String [] args){
	Scanner scanobj = new Scanner(System.in);
	int[] num;
	int i;
	
	System.out.print("Enter the value : ");
	i = scanobj.nextInt();
	num = new int[i];
	for(int j = 0; j<num.length; j++){
	System.out.println("Enter the value for num["+j+"] :");
	num[j] = scanobj.nextInt();
	}
	System.out.println("\n\n\n\n");
	System.out.println("----Array----");
	for(int k = 0; k <num.length; k++)
	{
	System.out.println("Value of Array["+k+"] :"+num[k]);
	}
	int sum  = 0;
	for(int l = 0; l< num.length; l++){
	sum = sum + num[l];
	}
	System.out.println("\n\n\n\nSum of the array is :"+sum);
	}}
