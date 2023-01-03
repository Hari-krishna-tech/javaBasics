package collections.List;

import java.util.ArrayList;
import java.util.*;
public class LearnArrayList {
    public static void main(String[] args) {
        // you can't dynamically increase the size of the normal array 
        // to solve this problem we use arrayList that internally use array but it is scalble 
        // insertion take a average time complexity of o(1)
        ArrayList<String> studentsName = new ArrayList<>();
        studentsName.add("Hari");
        studentsName.add("krishna");
        studentsName.add(1, "T");
        //System.out.println(studentsName);
        ArrayList<String> newList = new ArrayList<>();
        newList.addAll(studentsName);
       // System.out.println(newList.get(1));
       //// System.out.println(newList.remove(1)); // returns the removed element
       // System.out.println(newList);
      //  System.out.println(newList.remove(String.valueOf("Hari")));
      //  System.out.println(newList);
      //  System.out.println(studentsName.size());
        for(String ele: studentsName) {
            System.out.println(ele);
        }
        Iterator<String> it = studentsName.iterator();
        while(it.hasNext()) {
            System.out.println("iterator " + it.next());
        }
    }
}
