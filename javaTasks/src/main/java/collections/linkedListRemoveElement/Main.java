package collections.linkedListRemoveElement;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> personList = new LinkedList<>(Arrays.asList("Alice", "Bob", "Adam", "John", "Hank"));
        LinkedListRemover removeElementFromLinkedList = new LinkedListRemover();
        removeElementFromLinkedList.remove(personList);
    }
}
