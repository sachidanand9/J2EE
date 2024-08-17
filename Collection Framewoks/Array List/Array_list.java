import java.util.ArrayList;
import java.util.List;


public class Array_list{
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        list.add(4);   // This will add 4th at end of list
        System.out.println(list);

        list.add(1,9); // this will addd 9 at 1 index
        System.out.println(list);

        List<Integer> newList = new ArrayList();

        list.add(50);
        list.add(60);
     
        list.addAll(newList);
        System.out.println(list);

    }
}