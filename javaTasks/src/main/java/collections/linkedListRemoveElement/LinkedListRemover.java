package collections.linkedListRemoveElement;

        import java.util.List;

public class LinkedListRemover {

    public void remove(List<String> personList) {

        while (personList.size() != 1) {
            int everySecondElement = 1;
            for (int i = 0; i < personList.size(); i++) {
                if (i == everySecondElement) {
                    personList.remove(i);
                    everySecondElement++;
                }
            }
            System.out.println(personList);
        }
    }
}

