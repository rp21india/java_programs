package lab;
import  java.util.*;

public class three_greter_Number_14Tp17 {
		 public static void main(String[] args) {
		
			 int a;
			 int b;
			 int c;
			 int d;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter the number a:");
		        a = s.nextInt();
		        System.out.print("Enter the number b:");
		        b = s.nextInt();
		        System.out.print("Enter the number c:");
		        c = s.nextInt();  
		    
		         d=(a>b)?(a>c?a:c):(b>c?b:c);
		        System.out.println(d);
		    
		       
		       	 
			  }
			}