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
    /*
     1 
     0 1
     1 0 1
     0 1 0 1
     1 0 1 0 1
     */
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j <= i; j++) {
            if((i+j)%2==0) {
                System.out.print("1 ");

            }else {
                System.out.print("0 ");
            }
        }
        System.out.println();
    }

    /*
     1      1
     12    21
     123  321
     12344321
     */
    for(int i = 0; i < 5; i++) {
        for(int j = 1; j <= 8; j++){
            int upper = 8 - i - 1;
            int lower = 1 + i + 1;
            boolean empty = j >= lower && j <= upper;
            if(j <= 4) {
                if(!empty) System.out.print(j);
                else 
                System.out.print(" ");
            } else {
                int num = -(j % 5) + 4;
                if(!empty) System.out.print(num);
                else
                System.out.print(" ");
            }

        }
        System.out.println();
    }
    /*
     1 
     2 3 
     4 5 6
     7 8 9 10
     11 12 13 14 15
     */
    int num = 1;
    for (int i = 0; i < 5; i++) {
        for(int j = 0; j <= i; j++) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
    }
    /*
     A 
     AB
     ABC 
     ABCD 
     ABCDE
     */
    for(int i = 0; i < 5; i++) {
        for(int j = 0; j <= i; j++) {
            char alphabet = Character.toChars(65 + j)[0];
            System.out.print(alphabet);
        }
        System.out.println();
    }
    /*
     ABCDE 
     ABCD 
     ABC
     AB
     A
    */
    for(int i = 0; i < 5; i++) {
        for(int j = 5; j > i; j--) {
            char alphabet = Character.toChars(70 - j)[0];
            System.out.print(alphabet);
        }
        System.out.println();
    }

    /*
     A 
     BB 
     CCC 
     DDDD 
     EEEEE
     */
    for(int i = 0; i < 5; i++) {
        for(int j = 0,k = 1; j <= i; j++) {
            char alphabet = Character.toChars(65 + i)[0];
            System.out.print(alphabet);
        }
        System.out.println();
    }

    /*
        A 
       ABA
      ABCBA
     ABCDCBA
     */
    for (int i = 0; i < 4; i++) {
        for(int j = 1,code = 65; j <= 7; j++) {
            int upper = 4 + i; 
            int lower = 4 - i;
            boolean valueExist = j >= lower && j <= upper;
            if(!valueExist) {
                System.out.print(" ");
            } else {
                int mid  = 4;
                char alphabet;
               // System.out.print(" mid : " + mid);
                if(j <= mid) {
                    alphabet = Character.toChars(code)[0];
                    if(j != mid) code++;
                    //System.out.println(code);
                } else {
                   // code--;
                    alphabet = Character.toChars(--code)[0];
                //System.out.println(code);
                }
                System.out.print(alphabet);
            }
        }
       System.out.println();
    }
    }
}
