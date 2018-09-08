package Interview_question;

public class Fibonacci_sum {

    public static void main(String[] args) {

        int  a = 0;
        int b = 1;
   //     System.out.print(a + " "+ b+ " " );
       int sum=a+b;
        int c=a+b;
       for (int i = 3; i <= 10; i++)
        {      
            c = a + b;
            a = b;
            a = c;
       //    System.out.print(c + " ");
           sum=sum+c;
       }
        System.out.println(sum);
    }
}