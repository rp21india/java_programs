package Interview_question;
import java.util.*;
public class String_First_Occurence {
public static void main(String[] args) {
	System.out.println("enter string");
	Scanner in = new Scanner(System.in);
	String str  = in.nextLine();
	char chArray[] =str.toCharArray();
	System.out.println("which charchter find please enter");
	char ch = in.nextLine().charAt(0);
	for(int i=0;i<str.length();i++) {
		if(ch==chArray[i])
		{
			System.out.println(ch+"\t is present in index"+" "+i);
			break;
		}
	}

}
}

