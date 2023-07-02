public class ifElse {
    public static void main (String []args) {
        /*if and Else  based on some conditions.   
         * we write code in if and else when its a condition.
         * -------only one condition will execute from the if body or else body-------
         * Basic Sintex :-
         * if(Contiontional blog written here)
         * {
         * Conditional Code written under this curli brackets
         * }
         * else
         * {
         * else code written under this curli brackets.
         * }
         * 
         * lets check some examples------
    //     */
        // int age =16;
        // if(age>=18)
        // {
        //     System.out.println("legal adult");
        // }
        // else 
        // {
        //     System.out.println("you r a kid");
        // }

        // <----------need more prectice for if else--------->

        int age = 10;
        if(age>=18 && age<=60)
        {
         if(age>=18 && age<20)
         {
            System.out.println("Younger girl");
         }
         else if(age>20 && age <30)
         {
            System.out.println("Younger boy");
         }
         else
         {
            System.out.println("older");
         }
        }
        
        else if(age>=30 && age <40)
        {
            System.out.println("You r in your 30s");
        }
        else if(age>=40 && age<=45)
        {
            System.out.println("45`s");
        }
        else if(age>=40 && age <50)
        {
            System.out.println("50s");
        }
        else if(age>60)
        {
           System.out.println("expire");
        }
        else
        {
            System.out.println("........");
        }
    }   

}

