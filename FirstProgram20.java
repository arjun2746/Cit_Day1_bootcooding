import java.util.Scanner;

public class FirstProgram20{
public static void main(String [] args){
	int num[];
	int i, j=0, min=0;
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
	
	
	for(int l = 0; l<num.length-1; l++){
		if(num[l]<num[l+1]){
			min = num[l];
	}}
	System.out.println("Minimum Value :"+min);


}}
