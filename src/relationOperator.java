// import javax.naming.spi.DirStateFactory.Result;

public class relationOperator {
    public static void main(String[] args){
        int a =10;
        int b =10;
        int c=40;

        boolean result =a!=c;
        boolean res1= a>c;
        boolean res2=b>=a && b<=a;
        boolean res3=b<c || b>a;
        System.out.println(result);
        System.out.println(res2);
        System.out.println(res1);
        System.out.println(res3);
        /*
         * Relational Opperators Symboles And Their Names

         * "==" Double Equaltoo
         * "<" Less Then
         * ">" Greater Then
         * "<=" Less Then Equaltoo
         * ">=" Greater Then Equaltoo
         * "!=" Not Equaltoo
         */

	// also there is 3 opperators--->
	1. "AND" it is denotes as "&&" 
		* When all the statements become true then the final result will be true..
	2. "OR" it is denotes as "||" 
		*When one statement is true, final result will be true .. no metter how many statements will false in the given statements...
	3. "NOT" it is denotes as "!"
		*When a statement true,, the final result will be "!false"
    }
}
