package Interview_question;
import java.util.*;
public class Reverse_word_DS {

		public static void main(String[] args) {			
		
	Scanner in = new Scanner(System.in);
	System.out.println("please enter string at word level");
	Stack<String> wordstack  = new Stack<String>();
	String lineofText= in.nextLine();                                                                                                                                               
		
		String[] wordArray = lineofText.split(" ");

		for (String word : wordArray ) 
		{
				wordstack.push(word)	;
		}
		System.out.println("\n here's the word in revers order");
		while(wordstack.empty() == false) 
		{
			System.out.print(wordstack.pop() + "  ");
		}	
	}
	}
//please enter string at word level
//						java hello

 //here's the word in revers order
//   						hello   java  




