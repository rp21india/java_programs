package lab;
import  java.util.*;

public class add_without_operator_9 {
		 public static void main(String[] args) {
		
			 int a=10;
			 int b=20;
			int carry=0;
			 while(b!=0) {
				 carry=a&b;
				 a=a^b;
				 b=carry << 1;
			 }
			 System.out.println(a);
			  }
			}