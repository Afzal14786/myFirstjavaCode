public class ternary{
    public static void main(String[] args) {
        // --------basic sintex of ternary operator------>
        /*
         * step 1:- (Condition)? T : F
         * Examples :----
         */
        /* this is 
         * nesting in ternary operator
         */
        int a,b,c;
         a =10;
         b=30;
         c=50;
        String num2=(a>b)? (b>c? "b is less": "c is greater"):(a<c? "a is less": "c is greater");
        System.out.println(num2);
        int num1=(a>b)? (a<c? a: b): (b<c? b:c);
        System.out.println(num1);
    }
}