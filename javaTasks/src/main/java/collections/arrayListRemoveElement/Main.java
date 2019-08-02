package collections.arrayListRemoveElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List <String> personList = new ArrayList<>(Arrays.asList("Alice", "Bob", "Adam", "John", "Hank"));
        ArrayListRemover removeElement = new ArrayListRemover();
        removeElement.remove(personList);
    }
}
