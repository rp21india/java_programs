package lab;
import java.util.*;
public class count_word_string_80 {
	 static int count(String s) {
         // TODO Auto-generated method stub
         int count=0;
         if(s.charAt(0)!=' '){
             count++;
         }
         for(int i=0;i<s.length();i++){
             if((s.charAt(i)==' ')){
                 count++;
             }
         }
         return count;
     }
	  public static void main(String args[]){
          Scanner in=new Scanner(System.in);
          System.out.println("Enter your sentence:[Try to ignore space at end]");
          String s=in.nextLine();
          System.out.println("Size of the string is "+s.length());
          int res=count(s);
          System.out.println("No of words in the given String --->>"+"  "+s+" "+"is"+" :"+res);
      }
    
}