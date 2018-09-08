package lab;
import java.util.*;
public class fact {
		public static int factorial(int n){
	   int output;
		       if(n==1){
		         return n;
		       }
		       //Recursion: Function calling itself!!
		       output = factorial(n-1)* n;
		       return output;
		   }  
		public static void main(String args[]){
			   Scanner in = new Scanner(System.in);
			   System.out.println("enter number");
			   int n=in.nextInt();
			   int result=factorial(n);
			   System.out.println(result);
			   //  System.out.println(test.fact(4));
			   
			   
		/*Scanner sc= new Scanner(System.in);
			System.out.println("enter factorial number");
			int num= sc.nextInt();
			int fact=1;
			for(int i=fact;i<=num;i++) {
				fact = fact*i;
			}
	System.out.println(fact);
	*/
	}
}