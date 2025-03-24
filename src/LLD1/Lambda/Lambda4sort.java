package LLD1.Lambda;
import java.util.*;

//Comparator --> functional interface
/*

class Bhs implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2)
    {
        if (o1 > o2) return 1;
        else if (o1 < o2) return -1;
        else return 0;
    }
}


public class Lambda4sort
{
    public static void main(String[] args) {
        Integer[] array = {1, 2, 6, 7, 3, 1, 0, 3, 4, 5};
        List<Integer> mutableList = new ArrayList<>(Arrays.asList(array));

        System.out.println(mutableList);
        Collections.sort(mutableList,new Bhs());
        System.out.println("Sorted: "+mutableList);

    }

}*/

// Using a Anonymous Class implementation---------------------------------------

//import java.util.*;
//
//public class Lambda4sort {
//    public static void main(String[] args) {
//        Integer[] array = {1, 2, 6, 7, 3, 1, 0, 3, 4, 5};
//        List<Integer> mutableList = new ArrayList<>(Arrays.asList(array));
//
//        System.out.println("Before sorting: " + mutableList);
//
//        // Using a Anonymous Class implementation
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2) {
//                        if (o1 > o2) return 1;
//                         else if (o1 < o2) return -1;
//                         else return 0;
//            }
//        };
//
//        Collections.sort(mutableList, comparator);
//
//        System.out.println("After sorting: " + mutableList);
//    }
//}



//. Using Lambda Expression:-------------------------

public class Lambda4sort {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 6, 7, 3, 1, 0, 3, 4, 5};
        List<Integer> mutableList = new ArrayList<>(Arrays.asList(array));

        System.out.println("Before sorting: " + mutableList);

        // Using lambda expression for sorting
        Collections.sort(mutableList, (o1, o2) ->
        {
            if (o1 > o2) return 1;
            else if (o1 < o2) return -1;
            else return 0;
        });

        System.out.println("After sorting: " + mutableList);
    }
}
