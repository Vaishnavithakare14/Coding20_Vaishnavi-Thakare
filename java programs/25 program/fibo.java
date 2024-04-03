//Write the code to find the Fibonacci series upto the nth term.
class Fibo{
    public static void main(String[]args){
        int a=0,b=1;
        int num=15;
        System.out.println(a+","+b+",");
        int nextTerm;
        for(int i=2; i<num;i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            System.out.println(nextTerm+ ",");
        }
    }
}