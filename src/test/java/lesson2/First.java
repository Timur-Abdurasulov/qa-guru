package lesson2;

import org.junit.jupiter.api.Test;

public class First {
    @Test
    public void first() {
        int a = 3;
        int b = 16;
        int c = sum(a, b);
        System.out.println(c);

        a = 22;
        b = 15;
        c = sum(22, 15);
//      c = sum(22, 15)
        System.out.println(c); //Gives us sum of two digits
//      System.out.println(sum(22, 15));
    }

    private int sum(int a, int b) {
        System.out.println(" First digit is: " + a + " and second is: " + b);
//                         " First digit is:     3     and second is:     16 "
        int c = a + b;
        return c;

    }

    @Test
    public void usingObjects() {
        Student mihail = new Student();
        mihail.setFirstName("Mihail");
        mihail.setLastName("The Greatest");
        mihail.setAge(18);
        mihail.setPersonalCode("123456-111111");

        Student timur = new Student();
        timur.setFirstName("Timur");
        timur.setLastName("Timurovich");
        timur.setAge(24);
        timur.setPersonalCode("654321-222222");

        System.out.println(mihail.getFirstName() + " " + mihail.getLastName());
        System.out.println(timur.getFirstName() + " " + timur.getLastName());
    }
}
