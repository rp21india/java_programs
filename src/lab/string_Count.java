package lab;
import java.util.*;
public class string_Count {
	
public static void main(String[] args) {
	String s="ramavtar";
	char[]c=s.toCharArray();
	int sz=c.length;
	int i=0,j=0,counter=0;
	
	for (i=0;i<sz;++i) {
		counter=0;
		for (j=0;j<sz;++j) {
		if(j < i && c[i] == c[j] ){
			counter++;
		}
		if(c[j] == c[i]) {
			counter++;
		}
		if(j == sz-1) {
			System.out.println(c[i]+"\t"+counter);
		}// end j
	}// i

} }
}
