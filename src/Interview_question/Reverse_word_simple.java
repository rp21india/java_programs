package Interview_question;
import java.util.*;
public class Reverse_word_simple {
public static void main(String[] args) {
	String  str =" java learning center";
	
	String[] a=str.split(" ");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]+ " ");	
	}
	System.out.println(" ");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]+ "  ");
	}
}
}
/*  
java 
learning 
center 
 
center  
learning  
java  
 * 
 */
