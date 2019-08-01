package collections.sumOfNumbers;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Summing {

    public void sum(Set<Integer> originalSet){
        Set<Integer> resultSet = new LinkedHashSet<>();
        Set<Integer> mesneSet = new LinkedHashSet<>();
        int originalSetSize = originalSet.size();

        for (int i = 0; i < originalSetSize - 1; i++) {
            mesneSet.addAll(originalSet);
            int firstElement = mesneSet.iterator().next();
            mesneSet.remove(firstElement);

            Iterator<Integer> mesneSetIterator = mesneSet.iterator();
            Iterator<Integer> originalSetIterator = originalSet.iterator();

            while (mesneSetIterator.hasNext()) {
                if (originalSetIterator.hasNext()) {
                    resultSet.add(mesneSetIterator.next() + originalSetIterator.next());

                }
            }
            originalSet.removeAll(originalSet);
            mesneSet.removeAll(mesneSet);
            originalSet.addAll(resultSet);
        }
        System.out.println("Попарные суммы эелементов: "+ resultSet);
    }
}
