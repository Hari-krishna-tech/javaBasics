import java.util.Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor8;

public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("given num is 1");
                break;
            case 2:
                System.out.println("given num is 2");
                break;
            case 3:
                System.out.println("given num is 3");
                break;
            case 4:
                System.out.println("given num is 4");
                break;
            default:
                System.out.println("given num is not 1,2,3,4");
                break;
        }
    }
}
