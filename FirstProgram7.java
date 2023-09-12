public class FirstProgram7{
public static void main (String [] args){
	int a = 15, b = 17, c =19;
	if((a>b)&&(b>c)){
	System.out.println(a+"is the greatest no");
	}
	else if((b>c)&&(c>a)){
	System.out.println(b +"is greatest no");
	}
	else if((a>b)&&(a>c)){
		System.out.println(a+"is greatest no");
	}
	else if((b>a)&&(b>c)){
		System.out.println(b+"is greatest no");
	}
	else{
	System.out.println(c+"is greatest no");
}}
}