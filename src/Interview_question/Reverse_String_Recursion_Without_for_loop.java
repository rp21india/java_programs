package Interview_question;
import java.util.*;

public class Reverse_String_Recursion_Without_for_loop {

	  public static String reverse1(String str)
	    {
	        if (str.isEmpty())
	            return str;
	        //Calling Function Recursively
	        return reverse1(str.substring(1)) + str.charAt(0);
	    }
	public static void main(String[] args) {
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//	    String str = "Welcome ";
	        String reversed = reverse1(str);
	        System.out.println("The reversed string is: " + reversed);
	    }	  
	}