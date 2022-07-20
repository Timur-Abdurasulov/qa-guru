package homework4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HomeworkLoops {
    @Test
    public void twentyNumbers() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);

        for (int i = 0; i < numbers.size(); i++) {
            if ((i/2) == 4) {
                System.out.println(numbers.get(i++));
            }
        }
    }
}
