public class App {
    public static void main(String[] args){
        int age =10;
        int doorNo=236;
        int rollNo =01;
        System.out.println(age+ " "+doorNo+" "+rollNo); /* Chain Line code known as Chain Assignment */
        // System.out.println(age);
        // System.out.println(doorNo);
        // System.out.println(rollNo);
        // int m1, m2, m3, m4;
        // m1=m2=m3=m4=100;
        // System.out.println(m1+" "+m2+" "+m3+" "+m4); /*it is known as chain assignment because every variable has same data types and all the values are same for each variable   */

        /*Now lets talk about Compound Assignment 
         * here we write the code/syntex like following *
        */

        int a=100;
        a+=20; /*here we write the add ing syntex in the  existing value */
        System.out.println(a);/*here we add 5 in the existing value 100 */

        int b=208;
        b-=8;
        System.out.println(b); 
        /*here we subtract 4 in the existing value of 208 
        similar we can multiply and divide in the existing value of a variable. */

        int d=30;
        d*=2; /*here wee write multiplyintg code/syntex in the existing value */
        System.out.println(d);

        int l=400;
        l/=200; /* here we write divide code/syntex in the exesting value */
        System.out.println(l);
    }
}
