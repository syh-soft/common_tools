import com.syh.example.A;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static boolean isIsomorphic( List<Integer> items) {
     System.out.println(items.stream().filter(item->(item-1>0&&item-2<5)).count());
     return true;
    }

    public static void main(String[] agrs) {
        List<Integer> items = new ArrayList<>();

        items.add(5);
        items.add(6);
        items.add(7);
        items.add(8);
        isIsomorphic(items);

    }


}