package lab;
import java.util.*;
public class string_to_char_74_1 {

	public static void main(String[] args) {

		String str = "Java4s";
	     char[] chArray = new char[str.length()];
	 
	     for(int i=0; i<str.length(); i++){
	        chArray[i] = str.charAt(i);
	     }
	 
	     for(char ch : chArray){
	        System.out.println(ch);
	     }

	}
}
			    
	    
	
