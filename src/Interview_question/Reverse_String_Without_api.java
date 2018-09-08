package Interview_question;
import java.util.*;
public class Reverse_String_Without_api {
public static void main(String[] args) {
	System.out.println("enter string");
	String reverse = "";
	Scanner in  = new Scanner(System.in);
	String str = in.nextLine();
	int length =str.length();
	
	for (int i=length - 1; i>=0 ; i--) {
		reverse = reverse + str.charAt(i);
	}
	System.out.println(reverse);
}
	
}
