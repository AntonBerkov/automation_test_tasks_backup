package collections.sumOfNumbers;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> originalSet = new LinkedHashSet<Integer>() {
            {
                this.add(1);
                this.add(2);
                this.add(3);
                this.add(4);
                this.add(5);
            }
        };
       Sum sum = new Sum();
       sum.sum(originalSet);
    }
}
