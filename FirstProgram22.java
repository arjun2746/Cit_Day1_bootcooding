//checking the number of even elements in the array given by user

import java.util.Scanner;
public class FirstProgram22{
	public static void main(String [] args){
		Scanner scanobj;
		scanobj = new Scanner(System.in);
		int count = 0, i, count_even =0, count_odd=0;
		int [] num;
		System.out.println("---Array---");
		System.out.println("Enter the size of array :");
		i = scanobj.nextInt();
		num = new int[i];
		for (int j = 0; j <num.length; j++){
		System.out.println("Enter the value of the element array ["+j+"] :");
		num[j] = scanobj.nextInt();
		}
		System.out.println("\n\n\n---Array---");
		for(int k = 0; k<num.length; k++){
		System.out.println("Array ["+k+"]"+num[k]);
		}
		for(int l = 0; l<num.length; l++){
			if(num[l]%2==0){
				count_even += 1;
			}
			else{
				count_odd+=1;
		}}
			System.out.println("Even Count :"+count_even);
			System.out.println("Odd Count :"+count_odd);
}}