package lab;
import java.util.*;
public class string_count_2 {
public static void main(String[] args) {
	 String str = "HelloJava";
	    char[] ch = str.toCharArray();
	    int i=0,j=0;
	    for(i=0;i<ch.length;i++)
	    {
	        int count = 0 ;
	        for( j = i+1;j<ch.length;j++)
	        {//      4          6 , 8 , 10
	            if(ch[i] == ch[j] )                                           
	            {
	                count++;
	            }
	        }
	        if(count == 1)           
	        {
	            System.out.print(str.charAt(i) + " ");
	        }


	    }

}
}
