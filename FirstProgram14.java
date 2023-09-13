public class FirstProgram14{
	String str;
	String str1;
	String str2;
	String str3;
	void Display(String _str,String _str1, String _str2, String _str3){
	str = _str;
	str1 = _str1;
	str2 = _str2;
	str3 = _str3;
	System.out.println("---Values of Strings assigned---");
	System.out.println("String : "+str);
	System.out.println("String 1 :"+str1);
	System.out.println("String 2 :"+str2);
	System.out.println("String 3 :"+str3);
	}
public static void main(String[] args){
FirstProgram14 p1, p2, p3, p4, p5;
p1 = new FirstProgram14();
p2 = new FirstProgram14();
p3 = new FirstProgram14();
p4 = new FirstProgram14();
p5 = new FirstProgram14();

p1.Display("String 1", "String 2", "String 3", "String 4");
p2.Display("String 5", "String 6", "String 7", "String 8");
p3.Display("String 9", "String 10", "String 11", "String 12");
p4.Display("String 13", "String 14", "String 15", "String 16");
p5.Display("String 17", "String 18", "String 19", "String 20");

	

}}