public class logical {
    public static void main(String[] args) {
        /*
         * In logical Operator:- There are 3 operators 
         * 1 "AND" written as "&&"...
         * 2 "OR" written as "||"...
         * 3 "NOT" Written as "!"...
         * 
         *                  "AND"(&&) Operator....
         * 
         *          Expration(Exp1)     Exp2            Exp3            Result
         * 
         *              true            true            true             true
         *              true            false           true             false
         *              true            true            false            false
         *              false           false           true             false
         *              false           false           false            false
         * 
         * here in case of AND operator all the experations must be true for getting true value in output if anyone of the expression is false then the entire result is false.
         * Here is some examples of AND(&&) operator....
        */
        int a,b,c;
        a=10;
        b=10;
        c=90;
        boolean res=a==c && b>=a && c<a;
        System.out.println(res);

        /*
         *                  "OR" ("||") Operator...
         * 
         */
        
    }
}
