public class pattern4 {
    public static void main(String[] args) {

        // <-------Specific Patterns for printing Stars(*)-------->
        int n=4;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

		<------Sequence of pattern programming---->
		<------Here is some examples (//Mantion below) of pattern programing---->


        // int n=8;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i==0 || j==0 || j==n-1 || i==(n-1)/2){
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("   ");
        //     for(int j=0; j<n; j++){
        //         if(i==0 || j==0 || i==(n-1)/2){
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("   ");
        //     for(int j=0; j<n; j++){
        //         if(j==0 || i==n-1){
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("   ");
        //     for(int j=0; j<n; j++){
        //         if(i==0 || i==(n-1)/2 || i==n-1 || j==0){
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.print("   ");
        //     for(int j=0; j<n; j++){
        //         if(j==0 || j==n-1 || i==(n-1)/2){
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
            
        //     System.out.print("   ");
        //     for(int j=0; j<n; j++){
        //         if(i==0 || i==n-1 || j==(n-1)/2){
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
            
        //     System.out.print("   ");
        //     for(int j=0; j<n; j++){
        //         if(i==0 || j==(n-1)/2){
        //             System.out.print("*");
        //         }
        //         else
        //         {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
