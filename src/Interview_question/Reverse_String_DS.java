package Interview_question;
import java.util.*;
public class Reverse_String_DS {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.nextLine();
	Stack<Character> stack= new Stack<>();
	
	for (int i =0;i<str.length();i++) {
		stack.push(str.charAt(i));
	}
	System.out.println("reverse of string");

	while(!stack.empty()) {
		System.err.println(stack.pop());
	}
	
}
}
