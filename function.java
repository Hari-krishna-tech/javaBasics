public class function {

    public static int addAll(int[] arr) {
        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        // create a function to add all the numbers in array 
        int[] num = {1,2,4,6,6,7,10,15};
        System.out.println(addAll(num));
    }
}
