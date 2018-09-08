package lab;

public class Stringreverse {
	public static void main(String...args){
		String str="hello bro";
		char ch[]=str.toCharArray();
		System.out.println(ch);
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}

}