package collections.List;
import java.util.*;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("lion");
        animals.push("Dog");
        animals.push("Hourse");
        animals.push("Cat");
        System.out.println(animals);
        animals.pop(); // removes the top element
        animals.peek(); // top element
    }
}
