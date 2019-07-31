package collections.listRewriting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> listForRewrite = new ArrayList<>(Arrays.asList(1,-5,4,-7,42,-156,-9));
        System.out.println(listForRewrite);
        listForRewrite.sort(new ListComparator());
        System.out.println(listForRewrite);
    }
}
