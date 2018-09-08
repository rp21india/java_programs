package Interview_question;
import java.util.Scanner;
public class Reverse_String_recursion {
	
		  public static String reverse(String str)
		    {
		        if (str.isEmpty())
		            return str;
		        //Calling Function Recursively
		        return reverse(str.substring(1)) + str.charAt(0);
		    }
		public static void main(String[] args) {
			System.out.println("enter string");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
		        String reversed = reverse(str);
		        System.out.println("The reversed string is: " + reversed);
		    }	  
		}

//			output
//enter string
//hello java
//The reversed string is: avaj olleh

