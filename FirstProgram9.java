import java.util.Scanner;
public class FirstProgram9{
	
public static void main (String [] args){
	Scanner scanobj;
	scanobj = new Scanner(System.in);
	int i, remainder=0, i2=0;
	System.out.println("Enter the number to check if the given is a Palindrome or Not :");
	i = scanobj.nextInt();
	int num = i;
	while(i>0){
		remainder = i%10;
		i2 = (i2*10)+remainder;
		i=i/10;
	}
	if (num==i2){
		System.out.println(num+" is a Palindrome Number");
	}
	else{
		System.out.println(num+" is not a Palindrome Number");
	}
	scanobj.close();
}
}
		
	
	