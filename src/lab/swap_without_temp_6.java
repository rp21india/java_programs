package lab;
import  java.util.*;

public class swap_without_temp_6 {
		 public static void main(String[] args) {
		
			 int a=10;
			 int b=20;
			 System.out.println("before "+"\t"+a+"\t"+b);
			 a=a+b;
			 b=a-b;
			 a=a-b;
			 System.out.println("after "+"\t"+a+"\t"+b);
			  }
			}