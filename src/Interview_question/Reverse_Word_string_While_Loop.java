package Interview_question;
import java.util.*;

public class Reverse_Word_string_While_Loop {
	public static String  reverseWordString(String str) {
		String reverse="";
		String[] words = str.split("\\s");
		for (String s : words) {
			int j=s.length();
			String s1="";
			while(j>0) {
				char ch=s.charAt(j-1);
				s1=s1+ch;
				j--;
			}
		reverse=reverse+s1+ " ";  
		}
	System.out.println(reverse);
	return str;
	}
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter string");
	String str=sc.nextLine();
	String reverses=reverseWordString(str);
	
	}
}
//System.out.println(reverses);
	//
		//	 	String str="love india";
			 //	Reverse_Word_string_Last_To_First t1=new Reverse_Word_string_Last_To_First();
				//t1.reverseWordString(str);
