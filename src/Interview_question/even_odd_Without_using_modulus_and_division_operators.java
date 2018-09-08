package Interview_question;
import java.util.*;

public class even_odd_Without_using_modulus_and_division_operators {
	public static void main(String[] args) {
		int number;
	    Scanner in= new Scanner(System.in);
	 
	    System.out.println("Enter a number to check even or odd");
	    number=in.nextInt();
  
	    if((number & 1)==0){
	        System.out.println(+number+" is Even number");
	    }else{
	        System.out.println(+number+" is Odd Number");
	    } 
	}
}
		/*
		int number;
	    Scanner in= new Scanner(System.in); 
	    System.out.println("Enter a number to check even or odd");
	    number=in.nextInt(); 
	    
	    if( ( number >> 1) <<1==number){
	        System.out.println(+number+" is Even number");
	    }else{
	        System.out.println(+number+" is Odd Number");
	    }
	    */










/*

    */
