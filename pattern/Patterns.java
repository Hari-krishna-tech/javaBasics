package pattern;

public class Patterns {
    public static void main(String[] args) {
        // /*
        //  *****
        //  *****
        //  *****
        //  *****
        //  *****
        //  */
        // for(int i = 0; i< 5; i++) {
        //     System.out.println("*****");
        // }

        // /*
        //  *
        //  **
        //  ***
        //  ****
        //  *****
        //  */

        //  for(int i=0;i<5;i++){
        //     for(int j=0; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        //  /*
        //   1
        //   12
        //   123
        //   1234
        //   12345
        //   */
        // for(int i=0;i<5;i++){
        //     for(int j=0; j<=i; j++) {
        //         System.out.print(j+1);
        //     }
        //     System.out.println();
        //  }
        // /*
        //  1
        //  22
        //  333
        //  4444
        //  55555
        //  */
        // for(int i=0;i<5;i++){
        //     for(int j=0; j<=i; j++) {
        //         System.out.print(i+1);
        //     }
        //     System.out.println();
        //  }

        //  /*
        //   *****
        //   ****
        //   ***
        //   **
        //   *
        //   */

        // for(int i=5;i>0;i--){
        //    for(int j=0; j<i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }
        // /*
        //  12345
        //  1234
        //  123
        //  12
        //  1
        //  */
        // for(int i=5;i>0;i--){
        //     for(int j=0; j<i; j++) {
        //          System.out.print(j+1);
        //      }
        //      System.out.println();
        //   }
    /*
         *
        ***
       *****
      *******
     *********
     */

    for(int i =0; i< 5; i++) {
        for(int j=1; j <= 9; j++){
            int upper = 5 + i;
            int lower = 5 - i;
         //System.out.println(j + " " + upper +" "+ lower);
            String str = lower <= j&& upper >= j ?"*":" ";
            System.out.print(str);
        }
        System.out.println();
    }

    /*
     *********
      *******
       *****
        ***
         *
     */
    for(int i =0; i< 5; i++) {
        for(int j=1; j <= 9; j++){
            int upper = 9 - i;
            int lower = 1 + i;
         
            String str = lower <= j&& upper >= j ?"*":" ";
            System.out.print(str);
        }
        System.out.println();
    }

    /*
    *    
   ***   
  *****  
 ******* 
*********
*********
 ******* 
  *****  
   ***   
    *    
     */
    for(int i =0; i< 10; i++) {
        for(int j=1; j <= 9; j++){

            if (i >= 5) {
            int id = i%5;
            int upper = 9 - id;
            int lower = 1 + id;
         
            String str = lower <= j&& upper >= j ?"*":" ";
            System.out.print(str);
         }else {
            int upper = 5 + i;
            int lower = 5 - i;
         //System.out.println(j + " " + upper +" "+ lower);
            String str = lower <= j&& upper >= j ?"*":" ";
            System.out.print(str);
         }
            
        }
        System.out.println();
    }

    /*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
     */
    for(int i =0;i<10; i++) {
        if(i>=5){
            int id = i%5;
            for(int j=5; j > id; j--) {
                System.out.print("*");
            }
        }else {
            for(int j=0; j<= i; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    }
}
