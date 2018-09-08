package Interview_question;
import java.util.*;
public class Palindrome_String_check {
	
	public static void main(String[] args) {
		System.out.println("ente String");
		String reverse="";
	Scanner sc = new Scanner(System.in);
	String str= sc.nextLine();
	int length=str.length();

	for(int i =length-1; i >= 0 ; i--) 
		reverse=reverse+str.charAt(i);

	if(str.equals(reverse)) 
		System.out.println("yes");
	else 
		System.out.println("no");

	}
	}
