import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    @Test
    public void loopsLesson() {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Dmitry");
        studentNames.add("Svetlana");
        studentNames.add("Sergey");
        studentNames.add("Anna");
        studentNames.add("Denis");
        studentNames.add("Anton");
        studentNames.add("Timur");
        studentNames.add("Daniil");
        studentNames.add("Darja");
        // studentNames has: "Dmitry"", "Svetlana", "Sergey" (i.e. list of strings)
        // In Idea count starts from 0. Index for Dmitry will be 0, Svetlana - 1, Sergey - 2

        System.out.println(studentNames.get(1));
        System.out.println(studentNames.size());
        // Size gives number of elements in list
        System.out.println(studentNames.isEmpty());
        // isEmpty checks if list is empty. Empty - true, not empty - false

        System.out.println();

        //----------------FOR loop----------------
        // for (int i = 0; i < 3; i = i + 1) // i = i + 1 -> i++

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i));
        }

        System.out.println();

        //--------------FOREACH loop--------------
        for (String name : studentNames) {
            System.out.println(name);
        }

        // for is used to check certain thing, for example, every third
        // foreach loop is used to check every thing

        System.out.println();

        //Taking names with first letter "D"
        for (String name : studentNames) {
            if (name.startsWith("D")) {
                System.out.println(name);
            }
        }

        System.out.println();

        //--------------IF-ELSE loop--------------
        for (String name : studentNames) {
            if (name.startsWith("D")) {
                System.out.println(name + " - this name starts with D");
            } else {
                System.out.println(name + " - this name does not start with D");
            }
            // name starts with D - if result
            // name does not start with D - else result
        }
    }
}
