import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    @Test
    public void loopsLesson() {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Timur");
        studentNames.add("Svetlana");
        studentNames.add("Olga");
        studentNames.add("Anna");

        // studentNames has: "Timur", "Svetlana", "Olga" (i.e. list of strings)
        // In Idea count starts from 0. Index for Timur will be 0, Svetlana - 1, Olga - 2

        System.out.println(studentNames.get(1));
        System.out.println(studentNames.size());

        // Size gives number of elements in list

        System.out.println(studentNames.isEmpty());

        // isEmpty checks if list is empty. Empty - true, not empty - false

        //----------------FOR loop----------------
        // for (int i = 0; i < 3; i = i + 1) // i = i + 1 -> i++

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i));
        }

        //--------------FOREACH loop--------------
        for (String name : studentNames) {
            System.out.println(name);
        }

        // for is used to check certain thing, for example, every third
        // foreach loop is used to check every thing
    }
}
