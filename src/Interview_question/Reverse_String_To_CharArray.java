package Interview_question;
import java.util.*;
public class Reverse_String_To_CharArray {
	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner in= new Scanner(System.in);
		String str = in.nextLine() ;
		char[] ch =str.toCharArray();
		
		for (int i =ch.length-1; i>=0;i--) {
			System.out.println(ch[i]);
		}
}
}
/*
enter string
hello java
a
v
a
j
 
o
l
l
e
h
*/