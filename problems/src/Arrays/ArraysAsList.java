package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

    public static void main(String[] args) {

        //converting arrays to list

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(9);

        // instead of following the above lengthy approach we can use asList method

        list= Arrays.asList(2,6,9);

        //further simplification

        List<Integer> listNew = Arrays.asList(2,3,4);


    }
}
