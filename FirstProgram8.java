import javax.swing.*;
public class FirstProgram8{
public static void main (String [] args){
	{
	JFrame myWindow;
	myWindow = new JFrame();
	myWindow.setSize(300,200);
	myWindow.setTitle("FirstProgram7");
	myWindow.setVisible(true);
	JOptionPane.showMessageDialog(myWindow, "This a JFrame !");
	}
	String str4  = "Arjun@123";
	String str2 = "123123";
	String str = JOptionPane.showInputDialog(myWindow, "Enter your Name:");
	String str3 = JOptionPane.showInputDialog(myWindow, "Enter your Password : ");
	if(str3.equals(str2) && str4.equals(str)){
		JOptionPane.showMessageDialog(myWindow, "Access Granted");
		JOptionPane.showMessageDialog(myWindow, "Lets use switch case :\n Type the following number as input\n 1. Monday\n 2. Tuesday\n 3. Wednesday\n 4. Thursday\n 5. Friday\n 6. Saturday\n 7. Sunday");
		String i1 = JOptionPane.showInputDialog(myWindow, "Enter the value");
		int i =Integer.parseInt(i1);
		switch(i)
		{
			case 1:{
				JOptionPane.showMessageDialog(myWindow, "Monday");
				break;
			}
			case 2:{
				JOptionPane.showMessageDialog(myWindow, "Tuesday");
				break;
			}
			case 3:{
				JOptionPane.showMessageDialog(myWindow, "Wednesday");
				break;
			}
			case 4:{
				JOptionPane.showMessageDialog(myWindow, "Thursday");
				break;
			}
			case 5:{
				JOptionPane.showMessageDialog(myWindow, "Friday");
				break;
			}case 6:{
				JOptionPane.showMessageDialog(myWindow, "Saturday");
				break;
			}
			case 7:{
				JOptionPane.showMessageDialog(myWindow, "Sunday");
				break;
			}
			
			
		}
	}
	else{
		JOptionPane.showMessageDialog(myWindow, "Access denied !");
	}
	myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}}