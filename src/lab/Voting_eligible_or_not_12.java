package lab;
import  java.util.*;

public class Voting_eligible_or_not_12 {
		 public static void main(String[] args) {
		
			 int n;
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter the number you want to check:");
		        n = s.nextInt();
		        if(n >18)
		        {
		            System.out.println("The she  "+n+" is eligible");
		        }
		        else if(n < 18)
		        {
		            System.out.println("The she "+n+"  not eligible");
		        }
		       	 
			  }
			}