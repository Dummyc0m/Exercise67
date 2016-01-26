import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Object obj1 = new Object();

        ArrayList<Object> dummy1 = new ArrayList<>(Arrays.asList(new Object(), obj1, new Object()));

        ArrayList<Object> dummy2 = new ArrayList<>(Arrays.asList(new Object(), new Object(), obj1));

        ArrayList<Integer> dummy3 = new ArrayList<>(Arrays.asList(1, 3, -1, -1000, 56342));

        System.out.println(obj1);

        System.out.println(dummy1);

        System.out.println(dummy2);

        System.out.println(dummy3);

        removeSmallest(dummy3);

        filter(dummy1, dummy2);

        System.out.println(dummy1);

        System.out.println(dummy2);

        System.out.println(dummy3);
    }

    public static void removeSmallest(ArrayList<Integer> list) {
        int smallestInt = Integer.MAX_VALUE;
        int smallestIndex = -1;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(smallestInt) < 0) {
                smallestInt = list.get(i);
                smallestIndex = i;
            }
        }
        list.remove(smallestIndex);
    }

    public static void filter(ArrayList<Object> list1, ArrayList<Object> list2) {
        for(Object obj : list2) {
            for(int i = 0; i < list1.size(); i++) {
                if(obj == list1.get(i)) {
                    list1.remove(i);
                }
            }
        }
    }
}
