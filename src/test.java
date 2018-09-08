class Test {
    public static void main(String args[])  {
       int a=10;
       int b=20;
       System.out.println("before swap" + a +"\t"+ b);
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.println("after swap" + a +"\t"+ b);
    }    
}