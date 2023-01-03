public class arraysString {
    public static void main(String[] args) {
        int[] numArr = {1,2,3,4,5};
        // System.out.println(numArr[0]);
        // System.out.println(numArr[1]);
        // System.out.println(numArr[2]);
        // System.out.println(numArr[3]);
        // System.out.println(numArr[4]);
        // inititalization with size
        // float[] floatArr = new float[5];
        // for(int i=0; i < 5; i++) {
        //     floatArr[i] =  i +1 ;
            
        // }
        // for(int i =0; i < floatArr.length; i++) {
        //     System.out.println(floatArr[i]);
        // }

        // // new way to loop over array 
        // for (float i: floatArr) {
        //     System.out.println(i);
        // }
        int[][] arr=new int[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = i+j;
            }
        }
        for(int[] row: arr) {
            for(int ele: row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
