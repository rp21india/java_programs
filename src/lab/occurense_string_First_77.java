package lab;
import java.util.*;
public class occurense_string_First_77 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    System.out.printf("\nEnter a String : ");
		    String str = sc.nextLine();
		    char arr[] = new char[str.length()];
		    System.out.printf("\nEnter a Character : ");
		    char ch = sc.next().charAt(0);
		    for(int i = 0; i < str.length(); i++)  {
		      arr[i] = str.charAt(i);
		    }
		    for (int i = 0; i < arr.length; i++) {
		    	if (arr[i] == ch) 
		      {
		     System.out.println(i);
		        break;
		      }
		    }
	}
	}

			    
	    
	
