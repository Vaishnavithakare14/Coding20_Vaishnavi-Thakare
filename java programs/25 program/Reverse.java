 // 1 Write a code to reverse a number
 class Reverse{
    public static void main(String args[]){
        int num=12334, rem, reverse=0;
        while(num!=0){
            rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println(+reverse);


    }
}