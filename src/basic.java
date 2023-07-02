public class basic {
    public static void main (String[] args) {
        /*Examples of some basic of variables
         * We use only two symboles in declaring a variable....
         * 1st :- ("_") Underscore & 2nd ("$") dollar sign..
         *  No space in variable name like....
         * num Of Student = numOfStudent...
         >---------------------------------------------<
         * i.e :- int num_Of_Student =100;
         * int $sum =200;
         * string firstName ="Afzal";
         */
        int num1 =100;
        int $num2 =50;
        float res=num1/$num2;
        boolean res2=res!=num1;
        System.out.println(res2);
        System.out.println(res);   
         /*
          * when two integer divided each other then the result is also an integer.
          * it doe`nt metter where we store it.
          * Result is Trunked or rounding to zero
           # i.e :- 12/5 =2.0 (remainder is rounding to zero automaticaly)

           Type Casting :- Changing data from one form to another form is known as type casting.
           it is devided into two parts : 1 Implisit Type Casting ....2 Explasit Type Casting

           * It is known as Explisit Type Casting *
         */


        double info =300.345;
        int info1;                  /* Change Data form from one form to another form of data is known as Explisit Type Casting */
        info1 = (int)info;          /*Here Double Data type Change into Int Data Type.*/
        System.out.println(info1);
    }
}
