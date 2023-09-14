import java.util.Scanner;

public class FirstProgram19{
public static void main(String [] args){
	int num[];
	int i, j=0, max=0;
	Scanner scanobj;
	scanobj = new Scanner(System.in);
	System.out.println("---Array Entry---");
	System.out.println("Enter the sizer of array :");
	i = scanobj.nextInt();
	num = new int[i];
	for(j =0; j<num.length; j++)
	{
	System.out.print("Enter the Value of Array ["+j+"] :");
	num[j] = scanobj.nextInt();
	}
	
	
	for(int l = 0; l<num.length; l++){
		if(max<num[l]){
			max = num[l];
	}}
	System.out.println("Max Element :"+max);


}}
